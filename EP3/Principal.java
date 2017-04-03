import java.util.ArrayList;
import java.util.Collections;

public class Principal{
    public static void main(String[] args){
                ArrayList<Nota> lista = new ArrayList<Nota>();

                Disciplina lp2 = new Disciplina( "Lp2", "Herbert" );
		Disciplina web = new Disciplina( "web", "Marcelo" );
		
		Aluno a0 = new Aluno( "Bruno", 36);
		Aluno a1 = new Aluno( "Cesar", 19);
		Aluno a2 = new Aluno( "Julio", 13);
		Aluno a3 = new Aluno( "Caio", 59);
		Aluno a4 = new Aluno( "06", 98);
		
		lista.add(new Nota( 5, a0, lp2));
                lista.add(new Nota( 1, a0, web));
                lista.add(new Nota( 6, a1, lp2));
                lista.add(new Nota( 6, a1, web));
                lista.add(new Nota( 5.1, a2, lp2));
                lista.add(new Nota( 2, a2, web));
                lista.add(new Nota( 6.8, a3, lp2));
                lista.add(new Nota( 9.1, a3, web));
                lista.add(new Nota( 10, a4, lp2));
                lista.add(new Nota( 3, a4, web));
		
		for(int i = 0; i < 10; i++)
                        System.out.println(lista.get(i).getAluno().getNome() +"--"+ lista.get(i).getDisciplina().getNome() +": "+ lista.get(i).getNota() + " -Professor: " + lista.get(i).getDisciplina().getProfessor());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		Collections.sort(lista);
		
		for(int i = 0; i < 10; i++)
                        System.out.println(lista.get(i).getAluno().getNome() +"++"+ lista.get(i).getDisciplina().getNome() +": "+ lista.get(i).getNota() + " +Professor: " + lista.get(i).getDisciplina().getProfessor());
		
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("A maior nota foi: " + lista.get(0).getNota());
		
		int i = 0;
		while( lista.get(i).getDisciplina().getNome() != "Lp2")
			i++;
		System.out.println("A maior nota de lp2: " + lista.get(i).getNota());
    }
}

