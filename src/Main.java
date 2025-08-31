import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        String nome = scanner.next();

        System.out.println("Insira seu  sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Insira o número da sua Agência:");
        String agencia = scanner.next();

        String numeroConta = "1804-04";
        Double saldo = 990.85;

        System.out.printf("Olá %s, sua agência é %s, conta %s e seu saldo  de R$%s, já está disponível para saque.",nome,agencia,numeroConta,saldo);


    }
}