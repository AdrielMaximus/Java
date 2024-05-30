import java.util.Scanner;

public class condicionais {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sua divida atual é de 200 reais. qual o valor que voce possui para sanar a sua divida");
        int saldo = scanner.nextInt();
        int divida = 200;
        int valor = saldo - divida;
        if(saldo == divida){
            System.out.println("Divida quitada");
        } if(saldo < divida){
            
            System.err.println("falta" + valor +" Reais");

        }
        scanner.close();
    }
}
