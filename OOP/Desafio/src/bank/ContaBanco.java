
public class ContaBanco {

    public int numConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private boolean status;
        public void estadoAtual(){
            System.out.println("Conta: " + this.getNumConta());
            System.out.println("Tipo: " + this.getTipo());
            System.out.println("Dono: " + this.getDono());
            System.out.println("Saldo: " + this.getSaldo());
            System.out.println("Status: " + this.getStatus());
        }
        public class AbrirConta(){
            this.setStatus(true);
            if (this.getTipo() == "CC"){
                this.setSaldo(50);
            } else if (this.getTipo() == "CP"){
                this.setSaldo(150);
            }
            System.out.println("Conta aberta com sucesso!");
        }

        public class FecharConta(){
            if (this.getSaldo() > 0){
                System.out.println("Conta com dinheiro");
            } else if (this.getSaldo() < 0){
                System.out.println("Conta em débito");
            } else {
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso!");
            }
            
        }
        public class Depositar(){
            if (this.getStatus() == true){
                this.setSaldo(this.getSaldo() + valor);
                System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
            } else {
                System.out.println("Impossível depositar em uma conta fechada");
            }
            
        }
        public class Sacar(){
            if (this.getStatus() == true){
                if (this.getSaldo() >= valor){
                    this.setSaldo(this.getSaldo() - valor);
                    System.out.println("Saque realizado na conta de " + this.getDono());
                } else {
                    System.out.println("Saldo insuficiente");
                }
            } else {
                System.out.println("Impossível sacar de uma conta fechada");
            }
        }
        public class PagarMensalidade(){
            int v = 0;
            if (this.getTipo() == "CC"){
                v = 12;
            } else if (this.getTipo() == "CP"){
                v = 20;
            }
            if (this.getStatus() == true){
                if (this.getSaldo() > v){
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("Mensalidade paga com sucesso por " + this.getDono());
                } else {
                    System.out.println("Saldo insuficiente");
                }
            } else {
                System.out.println("Impossível pagar uma conta fechada");
            }
            
        }
        public void ContaBanco(){
            this.setSaldo(0);;
            this.setStatus(false);
        }
        public void setNumConta(int numConta){
            this.numConta = numConta;
        }
        public int getNumConta(){
            return this.numConta;
        }
        public void setTipo(String tipo){
            this.tipo = tipo;
        }
        public String getTipo(){
            return this.tipo;
        }
        public void setDono(String dono){
            this.dono = dono;
        }
        public String getDono(){
            return this.dono;
        }
        public void setSaldo(float saldo){
            this.saldo = saldo;
        }
        public float getSaldo(){
            return this.saldo;
        }
        public void setStatus(boolean status){
            this.status = status;
        }
        public boolean getStatus(){
            return this.status;
        }

        
    }