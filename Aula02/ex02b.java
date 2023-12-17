// Classe: Objeto Concreto

package aula02.ex;

public class ClassObjConcreto {
    // Classe objeto concreto
        // Carro   
    String marca;
    String modelo;
    String combustivel;
    boolean arrancar;
        
    void criarMarca(String m){
        this.marca = m; 
    }
    
    void criarModelo(String mod){
        this.modelo = mod;
    }
    
    void tipoCombustivel(String comb){
        this.combustivel = comb;
    }
    
    void ligarMotor(){
        arrancar = true;
    }
    
    void pararMotor(){
        arrancar = false;
    }
    
    void iniciarMarcha(){
       if(this.arrancar == true){
           System.out.println("Vamos iniciar a viagem!");
       }else {
           System.out.println("O motor está parado! Viagem Impossível!");
       }
    }
    
    void infoCarro(){
        String motorAtrabalhar = "";
        if(this.arrancar == true){
            motorAtrabalhar = "Motor a Trabalhar!";
        }else{
             motorAtrabalhar = "Motor Desligado!";
        }
        
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Combustivel: " + this.combustivel);
        System.out.println(motorAtrabalhar);
    }
}
