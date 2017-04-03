public class Principal{
        public static void main(String args[]){
		Circulo cir1 = new Circulo(2);
		System.out.println(cir1.calcArea() +"--"+ cir1.calcPeri());
                Triangulo tr1 = new Triangulo(6,6);
                System.out.println(tr1.calcArea() +"+++"+ tr1.calcPeri());
                Retangulo re1 = new Retangulo(2,2);
                System.out.println(re1.calcArea() +"+++"+ re1.calcPeri());

        }
}
