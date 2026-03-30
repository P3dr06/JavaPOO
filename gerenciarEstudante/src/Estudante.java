public class Estudante {
  public static final String faculdade= "FATEC Mogi Mirim - Arthur de Azevedo";
  private String nome;
  private String ra;
  public static String turma = "ADS - Manha";
  public static int semestre = 3;
  private  double nota1, nota2;
  private double media;

    public String getNome() {
        return nome;
    }

    // O metodo .matches() verifica se a String corresponde
    //  integralmente a um padrão de Expressão Regular (Regex),
    //  retornando true se o texto seguir o molde ou false caso contrário.
    public boolean setNome(String nome) {
        if (nome.matches("[a-zA-Z\\s]+")) {
            this.nome = nome;
            return true;
        } else {
            System.out.println("Nome invalido! Nao utilize caracteres especiais, apenas letras e espaço");
            return false;
        }
    }

    public String getRa() {
        return ra;
    }

    public boolean setRa(String ra) {
        if (ra.matches("[0-9]+")) {
            this.ra = ra;
            return true;
        } else{
            System.out.println("RA invalido!");
            return false;
        }
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
        System.out.println("Nome do aluno: "+nome+"\nRA do aluno: "+ra+"\nMedia do aluno: "+media);
        if (media>=6) System.out.println("Aprovado");
        else System.out.println("Reprovado");
    }
    //metodo estatico: Métodos estáticos são funções que você pode chamar sem precisar criar
    // um aluno com new. Eles pertencem à "ideia" de Estudante, não a um estudante específico.
    public static void assinaturaFacul(){
        System.out.println("\nAss: "+faculdade);
    }
}

