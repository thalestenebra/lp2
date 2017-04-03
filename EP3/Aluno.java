ackage principal;
public class Aluno implements Comparable<Aluno>{
    private String nome;
    private int idade;
    
    public Aluno(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }
    public void setNome(String nome){
        this.nome = nome;    
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;    
    }
    public int getIdade(){
        return idade;    
    }
    public int compareTo(Aluno outroAluno){
        if(this.getIdade() < outroAluno.getIdade()){
            return 1;        
        } else if(this.getIdade() < outroAluno.getIdade()){
            return -1;        
        } else{
            return 0;        
        }
    }
}
