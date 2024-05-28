
public class Tv {
    public static void main(String[] args) throws Exception {
        boolean ligada = false;
        int volume = 0;
        int canal = 0;
        System.out.println("A tv está ligada?" + ligada);
        System.out.println("Qual o volume da tv?" + volume);
        System.out.println("Qual o canal da tv?" + canal);
        
    }
    public static boolean Ligar(boolean ligada){
        return true;
    }
    public static boolean Desligar(boolean ligada){
        return false;
    }
    public static int Mudar(int canal){
        return canal;
    } 
}
