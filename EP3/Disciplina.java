public class Disciplina{
    private String nome;
    private String professor;

    public Disciplina(String nome, String professor){
        setNome(nome);
        setProfessor(professor);    
    }
    public String getNome(){
        return this.nome;    
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getProfessor(){
        return professor;
    }
    public void setProfessor(String professor){
        this.professor = professor;
    }
}
