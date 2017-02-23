public class Ponto{
	private double x, y;
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public static void main (String args[]){
		Ponto p1 = new Ponto();
			p1.setX(10);
			p1.setY(20);
		Ponto p2 = new Ponto();
			p2.setX(15);
			p2.setY(30);
		System.out.println(Math.sqrt(((p1.x-p2.x)*(p1.x-p2.x))*((p1.y-p2.y)*(p1.y-p2.y))));
		Reta r1 = new Reta();
		r1.setP1(p1);
		r1.setP2(p2);
		r1.getP1().getX();
		r1.getP2().getY();
		p1.setX(30);
		r1.getP2().setY(40);
		System.out.println(r1.getP1().getX());
		System.out.println(r1.getP1().getY());
		System.out.println(r1.getP2().getX());
		System.out.println(r1.getP2().getY());
	}
}
