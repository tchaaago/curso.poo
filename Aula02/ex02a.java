// Classe: Objeto Abstrato

package aula02.ex;

public class ClasseObjAbstrato {
    // Classe objeto Abstrato
        // Aluno Academia
    
    String nome;
    int idade;
    float peso;
    boolean inscrito = false;
    
    void mostraFichaAluno(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
    }
    
    void increver(){
        this.inscrito = true;
    }
    
    void treinarNaAcademia(){
        if(this.inscrito == true){
            System.out.println("Seja Bem Vindo! Bom Treino!");
        }else {
            System.out.println("Não está inscrito! Não pode Treinar!");
        }
    }
    
}
