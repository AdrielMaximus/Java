public class App {
    public static void main(String[] args) throws Exception {
        String padaria[] = {"pao", "doce", "salgado", "torta", "bolo", "pudim", "rosca", "pao de queijo", "pao de batata", "pao de leite", "pao de mel"};
        try {
            for (int objetos=0;objetos<padaria.length ; objetos++) {
                System.out.println("produtos disponiveis: "+ padaria[objetos]);
            }
        } catch (Exception e) {
            System.out.println("Erro: "+ e.getMessage());
        }
    }
}
