package outraQuestao;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Notas notas = new Notas();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        notas.nota1 = scan.nextDouble();
                
        System.out.println("Digite a segunda nota: ");
        notas.nota2 = scan.nextDouble();
                
        System.out.println("Digite a terceira nota: ");
        notas.nota3 = scan.nextDouble();
                
              
                if (notas.calcular() > 6) {
                    System.out.println("Aprovado");
                }else if (notas.calcular() > 4 && notas.calcular() <= 6) {
                    System.out.println("Verificação Suplementar");
                } else {
                    System.out.println("Recuperação");
                }
    }

}
