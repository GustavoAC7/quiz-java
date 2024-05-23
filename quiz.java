import java.util.Scanner;
public class quiz {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int acertos = 0;

        cabecalho cabecalho1 = new cabecalho();

        cabecalho1.Faculdade = "Faculdade: Faculdade Alfredo Nasser";
        cabecalho1.Aluno = "Aluno: Gustavo Alves Camargo";
        cabecalho1.Professor = "Professor: Brenno Pimenta";
        cabecalho1.Disciplina = "Disciplina: Algoritmo e Programaçao II";
        cabecalho1.Inicio = "Bem Vindo ao Quiz!";
        cabecalho1.escrevaCabecalho();


        questoes questoes1 = new questoes();
        questoes1.questoes = "1- Qual a capital do Brasil?";
        questoes1.A = "A) Goiânia";
        questoes1.B = "B) Aparecida de Goiânia";
        questoes1.C = "C) São Paulo ";
        questoes1.D = "D) Brasília ";
        questoes1.E = "E) Rio de Janeiro ";
        questoes1.escrevaquestao();
        questoes1.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        String resposta = (String) sc.nextLine();
        if (questoes1.iscorreta(resposta)){
            acertos = acertos+1;
        }


        questoes1.questoes = "1- Quem foi a primeira pessoa a viajar no Espaço?";
        questoes1.A = "A) Yuri Gagarin";
        questoes1.B = "B) A cadela Laika";
        questoes1.C = "C) Neil Armstrong";
        questoes1.D = "D) Marcos Pontes";
        questoes1.E = "E) Buzz Aldrin";
        questoes1.escrevaquestao();
        questoes1.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        if (questoes1.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("====================================================================== ");
        questoes questoes2 = new questoes();
        questoes2.questoes = "2- Qual a montanha mais alta do mundo";
        questoes2.A = "A) Mauna Kea";
        questoes2.B = "B) Dhaulagiri";
        questoes2.C = "C) Monte Chimborazo";
        questoes2.D = "D) Monte Everest";
        questoes2.E = "E) Pico da Neblina";
        questoes2.escrevaquestao();
        questoes2.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes2.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes3 = new questoes();
        questoes3.questoes = "3- Qual carro que indica que vai chover?";
        questoes3.A = "A) Corolla branco";
        questoes3.B = "B) Celta Preto";
        questoes3.C = "C) Creta Roxo";
        questoes3.D = "D) Fusca Azul";
        questoes3.E = "E) Brasilia Verde";
        questoes3.escrevaquestao();
        questoes3.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes4 = new questoes();
        questoes4.questoes = "4- Onde se localiza Machu Picchu";
        questoes4.A = "A) Colômbia";
        questoes4.B = "B) Peru";
        questoes4.C = "C) China";
        questoes4.D = "D) Bolívia";
        questoes4.E = "E) Índia";
        questoes4.escrevaquestao();
        questoes4.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes4.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes5 = new questoes();
        questoes5.questoes = "5- Quem inventou a lâmpada";
        questoes5.A = "A) Platão";
        questoes5.B = "B) Henry Ford";
        questoes5.C = "C) Descartes";
        questoes5.D = "D) Thomas Edison";
        questoes5.E = "E) Santos Dumont";
        questoes5.escrevaquestao();
        questoes5.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes5.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes6 = new questoes();
        questoes6.questoes = "6- Quantos ossos temos no nosso corpo??";
        questoes6.A = "A) 126";
        questoes6.B = "B) 206";
        questoes6.C = "C) 18";
        questoes6.D = "D) 300";
        questoes6.E = "E) 200";
        questoes6.escrevaquestao();
        questoes6.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes6.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes7 = new questoes();
        questoes7.questoes = "7- Barack Obama foi presidente de que país?";
        questoes7.A = "A) Estados Unidos da América";
        questoes7.B = "B) Inglaterra";
        questoes7.C = "C) Alemanha";
        questoes7.D = "D) Rússia";
        questoes7.E = "E) Brasil";
        questoes7.escrevaquestao();
        questoes7.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes7.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes8 = new questoes();
        questoes8.questoes = "8- Que país tem o formato de uma bota?";
        questoes8.A = "A) Butão";
        questoes8.B = "B) Portugal";
        questoes8.C = "C) Itália";
        questoes8.D = "D) México";
        questoes8.E = "E) Brasil";
        questoes8.escrevaquestao();
        questoes8.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes8.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes9 = new questoes();
        questoes9.questoes = "9- Que navio famoso naufragou na sua viagem inaugural?";
        questoes9.A = "A) Titanic";
        questoes9.B = "B) Antonov";
        questoes9.C = "C) Boeing";
        questoes9.D = "D) Airbus";
        questoes9.E = "E) Symphony of the Seas";
        questoes9.escrevaquestao();
        questoes9.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes9.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes10 = new questoes();
        questoes10.questoes = "O que é um tsunami?";
        questoes10.A = "A) Um ciclone";
        questoes10.B = "B)  Um tornado";
        questoes10.C = "C) Um maremoto";
        questoes10.D = "D) Um terremoto";
        questoes10.E = "E) Um incêndio";
        questoes10.escrevaquestao();
        questoes10.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes10.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes11 = new questoes();
        questoes11.questoes = "Qual a nacionalidade do sociólogo e filósofo Durkheim?";
        questoes11.A = "A) Alemã";
        questoes11.B = "B) Francesa";
        questoes11.C = "C) Inglesa";
        questoes11.D = "D) Italiana";
        questoes11.E = "E) Norueguesa";
        questoes11.escrevaquestao();
        questoes11.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes11.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes12 = new questoes();
        questoes12.questoes = "12- Um anel tem 3 pedras preciosas. Quantas pedras preciosas têm 11 anéis?";
        questoes12.A = "A) 33";
        questoes12.B = "B) 110";
        questoes12.C = "C) 333";
        questoes12.D = "D) 30";
        questoes12.E = "E) 14";
        questoes12.escrevaquestao();
        questoes12.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes12.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes13 = new questoes();
        questoes13.questoes = "13- Quais as respectivas cores da reciclagem do papel, do vidro, do metal e do plástico?";
        questoes13.A = "A) azul, verde, amarelo e vermelho";
        questoes13.B = "B) verde, azul, vermelho e amarelo";
        questoes13.C = "C) vermelho, amarelo, verde e azul";
        questoes13.D = "D) azul, amarelo, verde e vermelho";
        questoes13.E = "E) verde, amarelo, azul e vermelho";
        questoes13.escrevaquestao();
        questoes13.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes13.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes14 = new questoes();
        questoes14.questoes = "14- Os estudos sobre a radioatividade levaram o cientista neozelandês Ernest Rutherford a identificar uma região do átomo constituída de grandes espaços vazios chamada de";
        questoes14.A = "A) Núcleo";
        questoes14.B = "B) Orbital";
        questoes14.C = "C) Camada elétrica";
        questoes14.D = "D) Eletrosfera";
        questoes14.E = "E) Atomica";
        questoes14.escrevaquestao();
        questoes14.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes14.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes15 = new questoes();
        questoes15.questoes = "15- Em que ano foi usado um celular pela primeira vez no Brasil?";
        questoes15.A = "A) 1900";
        questoes15.B = "B) 1990";
        questoes15.C = "C) 1890";
        questoes15.D = "D) 2000";
        questoes15.E = "E) 2020";
        questoes15.escrevaquestao();
        questoes15.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes15.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

    }
}
