import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu Nome: ");
        String nome = scanner.next();

        System.out.println("Quanto você deseja depositar?: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}