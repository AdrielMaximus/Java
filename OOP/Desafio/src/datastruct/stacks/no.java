
package datastruct.stacks;

public class No {
    private int dado;
    private No reno = null;

    public No(int dado) {
        this.dado = dado;
    }

    public No() {
    }

    // Getter for dado
    public int getDado() {
        return dado;
    }

    // Setter for dado
    public void setDado(int dado) {
        this.dado = dado;
    }

    public static void main(String[] args) {
        // Example usage
        No no = new No();
        no.setDado(10);
        System.out.println(no.getDado());
    }
}        