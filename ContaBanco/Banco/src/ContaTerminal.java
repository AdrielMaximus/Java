import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numeros = 0;
        double saldo= 0.0;
        String Nome = null;
        String agencia = null;
        System.out.print("Digite o nome do titular da conta: ");
        Nome = sc.nextLine();
        System.out.print("Digite o número da conta EX:(xxxx): ");
        numeros = sc.nextInt();
        System.out.print("Digite o número da agência EX:(xxxx): ");
        agencia = sc.next();
        System.out.print("Digite o saldo da conta EX:(0,00): ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + Nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeros + " e seu saldo" + saldo + " já está disponível para saque");
        
    }
}