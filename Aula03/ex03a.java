package aula03.ex;

public class Aula03 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Crital";
        c1.cor = "Azul";
        //c1.ponta= 0.5f; //privado não se pode mexer
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.status(); //Referencia a método
        c1.rabiscar();
    }
    
}
