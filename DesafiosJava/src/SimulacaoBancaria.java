import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;

        while (true) {

            int opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double sacar = scanner.nextDouble();
                    if(saldo < sacar){
                        System.out.println("Saldo insuficiente.");
                        break;
                    }else{
                        saldo -= sacar;
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    }
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}