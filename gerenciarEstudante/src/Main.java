import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Estudante e1 = new Estudante();

        e1.setNome("Pedro");
        e1.setRa("12345");
        Scanner
            e1.setNota1(5.5);


        e1.setNota2(8.7);
        e1.calcularMedia();

//                                 Metodo desorganizado
//        System.out.println("Nome do aluno: "+e1.getNome()+", RA: "+e1.getRa()+
//                ", nota1: "+e1.getNota1()+", nota2: "+e1.getNota2()+", media: "+e1.getMedia());

        //Metodo correto e limpo
        e1.exibirStatus();
        }
    }

