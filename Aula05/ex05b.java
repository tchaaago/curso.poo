package aula05.ex;

public class ContaBanco {
   public int numConta;
   protected String tipoConta;
   private String donoConta;
   private double saldoConta;
   private boolean statusConta;
   
   //Métodos especiais
   public ContaBanco(){
       this.saldoConta = 0; //Saldo igual a zero
       this.statusConta = false; //Conta fechada
   }
   
   //Método get e set para o atributo numConta
   public int getNumConta(){
       return this.numConta;
   }
   public void setNumConta(int nrConta){
       this.numConta = nrConta;
   }
   
   //Método get e set para o atributo tipoConta
   public String getTipoConta(){
       return this.tipoConta;
   }
   public void setTipoConta(String tipo){
       this.tipoConta = tipo;
   }
   
   //Método get e set para o atributo donoConta
   public String getDonoConta(){
       return this.donoConta;
   }   
   public void setDonoConta(String dono){
       this.donoConta = dono;
   }
   
   //Método get e set para o atributo saldoConta
   public double getSaldoConta(){
       return this.saldoConta;
   }
   public void setSaldoConta(double valor){
       this.saldoConta = valor;
   }
   
   //Método get e set para o atributo status
   public boolean getStatus(){
       return this.statusConta;
   }
   public void setStatus(boolean status){
       this.statusConta = status;
   }
   
   //Métodos
   //Método para mostrar o estado atual da conta
   public void detalhesConta(){
       System.out.println("-------------------------------------------");
       System.out.println("\t ..: Banco CEV :.. ");
       System.out.println("-------------------------------------------");
       System.out.println("Nº Conta: " + this.getNumConta());
       System.out.println("Nome 1º titular: " + this.getDonoConta());
       System.out.println("Tipo de conta: " + this.getTipoConta());
       System.out.println("Saldo da Conta: " + this.getSaldoConta());
       if(this.getStatus()){
          System.out.println("Conta Ativa!"); 
       }else{
           System.out.println("Conta Inativa (Fechada)!");
       }       
       System.out.println("");
   }
   
   //Método para abrir uma conta
   public void abrirConta(String tpConta){
       this.setTipoConta(tpConta);
       this.setStatus(true);
       
       if(tpConta == "CC"){
           this.setSaldoConta(50);
       }else if (tpConta == "CP"){
           this.setSaldoConta(150);
       }
   }
   
   //Método para fechar a conta
   public void fecharConta(){
       if(this.getSaldoConta() > 0){
           System.out.println("Impossivel Fechar a conta!");
           System.out.println("A conta tem de saldo: R$ " + this.getSaldoConta());
           System.out.println("O saldo deve ser igual a R$ 0.");
       }else if(this.getSaldoConta() < 0){
           System.out.println("Impossivel Fechar a conta!");
           System.out.println("Esta conta tem uma Divida de: R$ " + (this.getSaldoConta() * -1)); 
           System.out.println("O saldo deve ser igual a R$ 0.");
           System.out.println("");
       }else{
           this.setStatus(false); //Conta Fechada 
       }
   }
   
   //Método para depositar valores na conta
   public void depositar(double valor){
       if(this.getStatus()){
           this.setSaldoConta(this.getSaldoConta() + valor);
       }else{
           System.out.println("Ainda não tem conta no Banco CEV!");
           System.out.println("Abra uma! Fácil! Seguro! Super Rentavél!");
       }
   }
   
   //Método para sacar dinheiro ou levantar
   public void levantar(double valor){
       if(this.getStatus()){
           if(this.getSaldoConta() >= valor){
              this.setSaldoConta(this.getSaldoConta() - valor); 
           }else{
               System.out.println("Saldo Insuficiente!");
               System.out.println("Levantamento solicitado: R$ " + valor);
               System.out.println("Saldo Disponivel: R$ " + this.getSaldoConta());
               System.out.println("");
           }
       }else{
           System.out.println("Ainda não tem conta no Banco CEV!");
           System.out.println("Abra uma! Fácil! Seguro! Super Rentavél!");
       } 
   }
   
   //Método para pagamento da mensalidade ao banco
   public void pagarMensal(){
       double valorMensal = 0;
       if(this.getTipoConta() == "CC"){
           valorMensal = 12;
       }else if(this.getTipoConta() == "CP"){
           valorMensal = 20;
       }
       
       if (this.getStatus()){
           if(this.getSaldoConta() > valorMensal){
               this.setSaldoConta(this.getSaldoConta() - valorMensal);
           }else{
               System.out.println("Saldo insuficiente!");
               System.out.println("Mensalidade: " + valorMensal);
               System.out.println("Saldo disponivel: " + this.getSaldoConta());
               System.out.println("");
           }
       }else{
           System.out.println("Ainda não tem conta no Banco CEV!");
           System.out.println("Abra uma! Fácil! Seguro! Super Rentavél!");
       }
   }
}
