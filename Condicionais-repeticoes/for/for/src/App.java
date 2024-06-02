import java.util.Scanner;  
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jogador 1. Digite sua ação");
        String jogador1 = sc.nextLine(); 
        System.out.println("Jogador 2. Digite sua ação");
        String jogador2 = sc.nextLine(); 
        if(jogador1.equals("pedra") && jogador2.equals("papel") || jogador1.equals("ataque") && jogador2.equals("papel") || jogador1.equals("ataque") && jogador2.equals("pedra")){
            System.out.println("Jogador 1 venceu");
        }else if(jogador2.equals("pedra") && jogador1.equals("papel") || jogador2.equals("ataque") && jogador1.equals("pedra") || jogador2.equals("ataque") && jogador1.equals("papel")){
            System.out.println("Jogador 2 venceu");
        }else if(jogador2.equals("pedra") && jogador1.equals("pedra")){
            System.out.println("ambos perderam");
        }else if(jogador2.equals("papel") && jogador1.equals("papel")){
            System.out.println("Ambos venceram");
        }else if(jogador2.equals("ataque") && jogador1.equals("ataque")){
            System.out.println("Aniquilação mútua");
        }
    sc.close();
    }
}
