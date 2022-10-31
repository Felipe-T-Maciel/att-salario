"# att-salario" 
import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        double salario, decimoTerceiro, ferias, salariofixo;
        int opcao = 1, meses;

        Scanner scan = new Scanner(System.in);

        System.out.println("\t=======\tSEJA BEM VINDO\t=======\n");
        System.out.println("Digite seu salario: ");
        salario = scan.nextDouble();
        salariofixo = salario;
        System.out.println("Quantos meses você trabalhou: ");
        meses = scan.nextInt();
        if (meses > 12) {
            meses = 12;
            System.out.println("O meses foram reajustados para 12 :)");
        }
        while (opcao != 4) {
            if (opcao > 0 & opcao <= 4) {
                System.out.println();
                System.out.println("=======\tESCOLHA UMA DAS OPÇÕES\t=======\n");
                salario = salariofixo;

                System.out.println("1 - Novo salário");
                System.out.println("2 - férias");
                System.out.println("3 - Décimo terceiro");
                System.out.println("4 - Sair");
                opcao = scan.nextInt();

                if (opcao == 1) {
                    if (salario <= 350) {
                        salario += salario * 0.15;
                    } else if (salario > 350 & salario <= 600) {
                        salario += salario * 0.10;
                    } else {
                        salario += salario * 0.05;
                    }
                    System.out.println("\n\n\n\n\nSeu novo salario será de " + salario);
                }
                if (opcao == 2) {
                    salario += salario / 3;
                    System.out.println("\n\n\n\n\nO seu salario de férias será de " + salario);

                }
                if (opcao == 3) {
                    salario += (meses * salario) / 12;
                    System.out.println("\n\n\n\n\nO seu salario de decimo terceiro sera de " + salario);

                }

            } else {
                System.out.println("\n\n\n\n\nOpção invalida");
            }
        }
    }
}
"# Atividade-op-es-do-salario" 
"# Atividade-op-es-do-salario" 
"# att-salario" 
"# att-salario" 
"# att-salario" 
