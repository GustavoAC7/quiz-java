import java.util.Scanner;
public class questoes {
    String questoes;
    String questaoes = "";
    String A = "";
    String B = "";
    String C = "";
    String D = "";
    String E = "";
    String correta = "";


    public void escrevaquestao (){
        System.out.println(this.questaoes);
        System.out.println(this.questoes);
        System.out.println(this.A);
        System.out.println(this.B);
        System.out.println(this.C);
        System.out.println(this.D);
        System.out.println(this.E);
        System.out.println(this.correta);
    }

    public boolean iscorreta(String resposta){
        if (resposta.equalsIgnoreCase(this.correta)){
            System.out.println("RESPOSTA CORRETA!");
            return true;
        }
        else
            System.out.println("RESPOSTA ERRADA!");
        System.out.println("A ALTERNATIVA CORRETA E A: " + this.correta);
        return false;
    }
}
