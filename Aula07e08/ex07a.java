package aula07.ex;

public class Aula07a {
    public static void main(String[] args) {
      /* Lutador l = new Lutador("Pretty boy", "França", 31 ,1.75f, 68.9f, 11, 2, 1);
       l.apresentar();
       l.status();*/
      
        Lutador l[] = new Lutador[7]; //array de lutadores
        l[0] = new Lutador("Pretty boy", "França", 31 ,1.75f, 68.9f, 11, 2, 1);
        
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        
        l[2] = new Lutador("Snpshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        
        l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.7f, 119.3f, 5, 4, 3);
        
        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        l[6] = new Lutador("BdKill", "Vietnam", 30, 1.76f, 123.26f, 2, 11, 3);
        
        /*Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();*/
        
        //Testes
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
    }    
}
