#include <iostream>

using namespace std;

int fat(int n, int cont, int x){
    if (cont < n){
        x = x * cont;
        cont++;
        return fat(n, cont, x);
    } else {
        cout << x;
    }
}

int mdc(int a, int b){
    if (a%b == 0){
        return b;
    } else{
        return mdc(b, a%b);
    }
}

int mdc3(int a, int b, int c){
    return mdc(mdc(a, b), c);
}

int fib(int x, int a, int b){
    if (a == 0 && x > 0){
        a = 1;
        b = 0;
        x--;
        return fib(x, a, b);
    } else if (x > 0){
        int aux = a;
        a = a + b;
        b = aux;
        x--;
        return fib(x, a, b);
    }else{
        return a;
    }
}

void decrescente(int x){
    if (x > 1){
        x--;
        cout << x;
        decrescente(x);
    } else if(x == 1){
        cout << 1;
    }
}

int resto(int a, int b){
    return a%b;
}

int div(int a, int b){
    return a - (a%b);
}

int form(int x){

}

int main()
{
    int n, cont = 0, x, a = 0, b = 0, c;
    //cin >> n;
    //x = n;
    //fat(n, cont, x);
    /*int a, b;
    cin >> a >> b;
    cout << mdc(a, b);
    cin >> a >> b >> c;
    cout << mdc3();*/
    cin >> a >> b;
    cout << div(a, b);
    return 0;
}
