package aula02.ex;

public class ObjAbstrato {
   public static void main(String[] args) {
       
       ClasseObjAbstrato treinoLivre = new ClasseObjAbstrato();        
       treinoLivre.nome = "Ana Marques";
       treinoLivre.idade = 25;
       treinoLivre.peso = 60;
       treinoLivre.mostraFichaAluno();
       treinoLivre.treinarNaAcademia();
       System.out.println("");
       
       ClasseObjAbstrato naAcademia = new ClasseObjAbstrato(); 
       naAcademia.nome = "Luis";
       naAcademia.idade = 36;
       naAcademia.peso = 99.8f;
       naAcademia.increver();
       naAcademia.mostraFichaAluno();
       naAcademia.treinarNaAcademia();
       System.out.println("");
   }
}
