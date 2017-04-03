public class Nota implements Comparable<Nota>{
    private double nota;
    private Disciplina disciplina;
    private Aluno aluno;

    public Nota(double nota, Aluno aluno, Disciplina disciplina){
        setNota(nota);
        setDisciplina(disciplina);
        setAluno(aluno);              
    }        

    public double getNota(){
        return this.nota;
    }    
    public void setNota(double nota){
        this.nota = nota;
    }
    public Disciplina getDisciplina(){
        return this.disciplina;
    }
    public void setDisciplina(Disciplina disciplina){
        this.disciplina = disciplina;
    }
    public Aluno getAluno(){
        return this.aluno;    
    }
    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }
    
    public int compareTo(Nota outraNota){
        if(this.getNota() > outraNota.getNota()){
            return -1;        
        } else if(this.getNota() < outraNota.getNota()){
            return -1;
        } else{
            return 0;
        }
    }   
}
