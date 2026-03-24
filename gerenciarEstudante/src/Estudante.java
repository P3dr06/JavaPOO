public class Estudante {
  private String nome;
  private String ra;
  private  double nota1, nota2;
  private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getNota1() {
        return nota1;
    }

    public boolean setNota1(double nota1) {
        if(nota1>=0 && nota1<=10) {
            this.nota1 = nota1;
            return true;
        }
        else System.out.println("Nota inválida!");
        return false;
    }

    public double getNota2() {
        return nota2;
    }

    public boolean setNota2(double nota2) {
        if(nota2>=0 && nota2<=10) {
            this.nota2 = nota2;
            return true;
        }
        else System.out.println("Nota inválida!");
        return false;
    }

    public double getMedia() {
        return media;
    }

    public double calcularMedia(){
        media = (nota1 + nota2) / 2;
        return media;
    }
    public void exibirStatus(){
        System.out.println("Nome do aluno: "+nome+"\nMedia do aluno: "+media);
        if (media>=6) System.out.println("Aprovado");
        else System.out.println("Reprovado");
    }
}

