import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(separar(4));
        System.out.println("Bem vindo ao nosso banco!");
        System.out.println(separar(4));
        System.out.println("Por favor, digite o número da AGÊNCIA: ");
        String agencia = scanner.next();

        System.out.println("Por favor, insira o número da CONTA: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, insira seu NOME: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, insira seu SALDO: ");
        Double saldo = scanner.nextDouble();

        System.out.println(separar(11));
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println(separar(11));
        System.out.println("Sua agência é: " + agencia + ", conta: " + numeroConta + " e seu saldo de: R$ " + saldo + " já está disponivel para saque!" );
        System.out.println(separar(11));
    }
    public static String separar(int repeticao){
        return "**********".repeat(repeticao);

    }
}