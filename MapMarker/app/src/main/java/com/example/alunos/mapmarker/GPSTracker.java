package com.example.alunos.mapmarker;

import android.app.AlertDialog;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by alunos on 11/10/17.
 */

public class GPSTracker extends Service implements LocationListener {

    private final Context mContext;
    boolean isGPSEnabled = false; // flag do status do GPS
    boolean isNetworkEnabled = false; // flag do status da rede
    boolean canGetLocation = false; // flag do status do serviço
    Location location; // Objeto que guarda s dados da localização
    double latitude; // latitude
    double longitude; // longitude

    // Distância mínima em metros para atualizar a posição
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 10; // 10 metros

    // Tempo mínimo a ser esperado entre atualizações consecutivas
    private static final long MIN_TIME_BW_UPDATES = 1000 * 60 * 1; // 1 minuto

    // Declarandp o Location Manager
    protected LocationManager locationManager;

    public GPSTracker(Context mContext){
        this.mContext = mContext;
        getLocation();
    }

    public Location getLocation() {
        try {
            locationManager = (LocationManager) mContext.getSystemService(LOCATION_SERVICE);

            // pega status do GPS
            isGPSEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

            // pega status da rede
            isNetworkEnabled = locationManager
                    .isProviderEnabled(LocationManager.NETWORK_PROVIDER);
            if (!isGPSEnabled && !isNetworkEnabled) {
                // sem informação de posição
            } else {
                this.canGetLocation = true;
                // Primeiro, tentamos pegar a posição pela rede
                if (isNetworkEnabled) {
                    locationManager.requestLocationUpdates(LocationManager
                                    .NETWORK_PROVIDER,
                            MIN_TIME_BW_UPDATES,
                            MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                    Log.d("Rede", "Rede");
                    if (locationManager != null) {
                        location = locationManager
                                .getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        if (location != null) {
                            latitude = location.getLatitude();
                            longitude = location.getLongitude();
                        }
                    }
                }
                // Se o GPS estiver habilitado, atualizamos a informação por ele
                if (isGPSEnabled) {
                    if (location == null) {
                        locationManager.requestLocationUpdates(
                                LocationManager.GPS_PROVIDER,
                                MIN_TIME_BW_UPDATES,
                                MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                        Log.d("GPS ativo", "GPS Ativo");
                        if (locationManager != null) {
                            // Finalmente, atualizamos a posição
                            location = locationManager
                                    .getLastKnownLocation(LocationManager.GPS_PROVIDER);
                            if (location != null) {
                                latitude = location.getLatitude();
                                longitude = location.getLongitude();
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Retoramos o objeto
        return location;
    }

    /**
     *
     * Esta função desliga o
     * GPS, fazendo a app parar de seguir a posição
     */

    public void stopUsingGPS(){
        if(locationManager != null){
            locationManager.removeUpdates(GPSTracker.this);
        }
    }

    /**
     * Retorna a latitude
     */

    public double getLatitude(){
        if (location != null){
            latitude = location.getLatitude();
        }
        // return latitude
        return latitude;
    }

    /**
     * Retorna a longitude
     * */

    public double getLongitude(){
        if(location != null){
            longitude = location.getLongitude();
        }
        // return longitude
        return longitude;
    }

    /**
     * Checa se o GPS/rede Wi-fi estão habilitados
     * @return boolean
     * */

    public boolean canGetLocation(){
        return this.canGetLocation;
    }

    /**
     * Caso  GPS e o Wi-gi estejam desabilitados,
     * mostra um alerta para que o usuário os habilite
     * */

    public void showSettingsAlert(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(mContext);

        // Settings Dialog Title
        alertDialog.setTitle("Configuração de GPS");

        // Settings Dialog Message
        alertDialog.setMessage("O GPS não está ativo. Deseja ir para as configurações?");

        // On Pessing Settings button
        alertDialog.setPositiveButton("Configuações", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int which){
                Intent intent = new Intent (Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                mContext.startActivity(intent);
            }
        });

        //on pressing cancel button
        alertDialog.setNegativeButton("Cancelar", new DialogInterface .OnClickListener(){
            public void onClick(DialogInterface dialog, int which){
                dialog.cancel();
            }
        });

        //Showing Alert Message
        alertDialog.show();
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
