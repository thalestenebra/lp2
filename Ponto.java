class Ponto{
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
		Ponto p3 = new Ponto();
			p3.setX(50);
			p3.setY(70);
		p3 = p1;
		System.out.println(p1.getX() + "-" + p1.getY());
		System.out.println(p2.getX() + "-" + p2.getY());
		System.out.println(p3.getX() + "-" + p3.getY());
	}
}
