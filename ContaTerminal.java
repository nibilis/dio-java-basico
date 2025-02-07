import java.util.Scanner;

/*** 
 * @author Nicolas Henriques
 * @since 07/02/2025
*/

public class ContaTerminal {
    public static void main(String args[]) {
        //creating variables
        int numero_conta;
        String agencia, nome_cliente;
        float saldo;

        //declaring scanner object
        Scanner sc = new Scanner(System.in);

        //printing messages and reading user input
        System.out.print("Número da conta: ");
        numero_conta = sc.nextInt();

        System.out.print("Número da agência: ");
        agencia = sc.nextLine();
        sc.nextLine();

        System.out.print("Nome do cliente: ");
        nome_cliente = sc.nextLine();

        System.out.print("Saldo da conta: ");
        saldo = sc.nextFloat();

        //printing confirmation message
        System.out.println("Olá " +
        nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ 
        agencia + ", conta " +
        numero_conta + "e seu saldo " + 
        saldo + " já está disponível para saque.");
    }
}