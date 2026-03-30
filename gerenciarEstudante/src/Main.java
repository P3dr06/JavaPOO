import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     Estudante e1 = new Estudante();

     //settando dados dos atríbutos como dev
//        e1.setNome("Pedro");
//        e1.setRa("12345");
//        e1.setNota1(5.5);
//        e1.setNota2(8.7);

     //settando dados dos atributos como usuário
        boolean nomeOk;
        do {
            System.out.println("Digite o nome do estudante: ");
            String nomeDigitado = sc.next();
            nomeOk = e1.setNome(nomeDigitado);
        } while (!nomeOk);

        boolean raOk;
        do {
            System.out.println("Digite o RA do estudante: ");
            String raDigitado = sc.next();
            raOk = e1.setRa(raDigitado);
        } while (!raOk);

        boolean notaOk;
        do {
            System.out.println("Digite a nota 1: ");
            double notaDigitada = sc.nextDouble();
            notaOk = e1.setNota1(notaDigitada);

        } while(!notaOk);

        do {
            System.out.println("Digite a nota 2: ");
            double notaDigitada2 = sc.nextDouble();
            notaOk = e1.setNota2(notaDigitada2);
        } while(!notaOk);

        e1.calcularMedia();

//                                 Metodo desorganizado de imprimir
//        System.out.println("Nome do aluno: "+e1.getNome()+", RA: "+e1.getRa()+
//                ", nota1: "+e1.getNota1()+", nota2: "+e1.getNota2()+", media: "+e1.getMedia());

        //Metodo correto e limpo de imprimir
        e1.exibirStatus();

        Estudante.assinaturaFacul();
        }
    }

