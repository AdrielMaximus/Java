import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // calling the contar method without the int keyword
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    } // Add closing brace for the main method

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o contador " + i + " na tela");
        }
    }

    private static class ParametrosInvalidosException extends Exception {

        public ParametrosInvalidosException() {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
} // Add closing brace for the Contador class
