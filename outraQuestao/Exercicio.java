package outraQuestao;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Notas notas = new Notas();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
                
        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();
                
        System.out.println("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();
                
              
                if (notas.resultado > 6) {
                    System.out.println("Aprovado");
                } if (notas.resultado > 4) {
                    System.out.println("Verifica��o Suplementar");
                } if  (notas.resultado < 6) {
                    System.out.println("Verifica��o Suplementar");
                } else {
                    System.out.println("Recupera��o");
                }
    }

}
