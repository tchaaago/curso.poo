package aula02.ex;

public class ObjConcreto {
    public static void main(String[] args) {
        
        ClassObjConcreto fordFocus = new ClassObjConcreto();        
        fordFocus.criarMarca("Ford");
        fordFocus.criarModelo("Focus");
        fordFocus.tipoCombustivel("Gasolina");
        fordFocus.ligarMotor();
        fordFocus.infoCarro();
        fordFocus.iniciarMarcha();
        
        System.out.println("");
        
        ClassObjConcreto peugeot306 = new ClassObjConcreto();
        peugeot306.criarMarca("Peugeot 306");
        peugeot306.criarModelo("2.0 HDI");
        peugeot306.tipoCombustivel("Diesel");
        peugeot306.pararMotor();
        peugeot306.infoCarro();
        peugeot306.iniciarMarcha();
        
        System.out.println("");
    }
}
