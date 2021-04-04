/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package show.pkgdo.milhao;

import javax.swing.JOptionPane;

/**
 *
 * @author mateu
 */
public class ShowDoMilhao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Pontos = 0;
        String usuario;
        usuario = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null,"Seja bem Vindo(a)! " + usuario);
        String fase1, fase2, fase3;
        fase1 =JOptionPane.showInputDialog("Usuario:" + usuario + "Pontos:" + Pontos + "\n" 
        + "O significa if? \n"
        + "a) Então \n"
        + "b) Talvez \n"
        + "c) ok \n"
        + "d) se" );
        if ( !"d".equals(fase1)){
            JOptionPane.showMessageDialog(null, "Resposta Incorreta");
            JOptionPane.showMessageDialog(null, "Sua pontuação é" + Pontos);
            System.exit(0);
        }
        else{
            JOptionPane.showMessageDialog(null, "Resposta Correta!");
            Pontos = Pontos + 1000;
        }
        fase1 = JOptionPane.showInputDialog("\n Usuario " +usuario+ "Pontos: " +Pontos+ "\n"
          + "O que significa Else ? \n"
          + "A) Se \n"
          + "B) Se não \n"
          + "C) Ok \n"
          + "D) Sei lá");      
        if("b".equals(fase1)){
            JOptionPane.showMessageDialog(null, "Resposta correta");
            Pontos = Pontos + 1000;
        }
        else {
            JOptionPane.showMessageDialog(null, "Resposta incorreta");
            Pontos = Pontos/2;
            JOptionPane.showMessageDialog(null, "Sua pontuação foi " + Pontos);
            System.exit(0);
        }
        fase1 =JOptionPane.showInputDialog("\n Usuario " +usuario+ " Pontos: " +Pontos+ "\n"
        + "Para q serve Import Java.sql.*: ? \n"
        + "A) Conexão com o mundo \n"
        + "B) Conexão com a classe \n"
        + "C) Conexão com o banco de dados \n"
        + "D) Conexão com o package \n");
        if ("c".equals(fase1)){
            JOptionPane.showMessageDialog(null, "Resposta correta:" );
            Pontos=Pontos+1000;
        }
        else{
            JOptionPane.showMessageDialog(null, "Resposta incorreta");
            Pontos = Pontos/2;
             JOptionPane.showMessageDialog(null, "Sua pontuação " + Pontos);
             System.exit(0);
        }
        fase1 = JOptionPane.showInputDialog("\n Usuário " +usuario+ "Pontos " +Pontos+ "\n"
        + "Para q serve JOptionPane ? \n"
        + "A) Pra criar uma caixa de Dialog \n"
        + "B) Fazer pesquisas \n" 
        + "C) Mudar fonte da letra \n"
        + "D) Digitar alguma mensagem \n" );
        if("a".equals(fase1)){
            JOptionPane.showMessageDialog(null, "Resposta correta");
            Pontos = Pontos + 1000;
        }
        else {
            JOptionPane.showMessageDialog(null, "Resposta incorreta");
            Pontos = Pontos/2;
             JOptionPane.showMessageDialog(null, "Sua pontuação " + Pontos);
             System.exit(0);
        }
        fase1 = JOptionPane.showInputDialog("\n Usuario: "+usuario+ "Pontos:" +Pontos+ "\n"
         + "O que é método main ? \n"
         + "A) É uma caixa de dialogo \n" 
         + "B) É o método usado pra fazer pesquisas \n"
         + "C) É o método que criptografa os textos \n"
         + "D) É o método principal \n");
        if("d".equals(fase1)){
            JOptionPane.showMessageDialog(null, "Resposta correta");
            Pontos = Pontos+1000;
        }
        else{
            JOptionPane.showMessageDialog(null, "Resposta Incorreta");
            Pontos=Pontos/2;
            JOptionPane.showMessageDialog(null, "Sua pontuação foi " +Pontos);
            System.exit(0); 
        }
        JOptionPane.showMessageDialog(null," PARABÉNS SEGUNDA FASE");
        fase2 = JOptionPane.showInputDialog("\n usuario" +usuario+ "Pontos" +Pontos+ "\n"
         + "O que é java? \n"
         + "A) É uma caixa de diálogo\n"
         + "B) é UM MÉTODO usado pra pesquisas\n"
         + "C) É uma linguagem de programação orientada a objetodos \n"       
         + "D) É um método pra criptografar objetos\n");
        if("c".equals(fase2)){
            JOptionPane.showMessageDialog(null, "Resposta correta");
            Pontos=Pontos+5000;
        }
        else{
            JOptionPane.showMessageDialog(null,"Resposta incorreta: ");
            Pontos=Pontos/2;
            JOptionPane.showMessageDialog(null, "Sua Pontuação" +Pontos);
            System.exit(0);
        }
        fase2 = JOptionPane.showInputDialog("\n Usuario " +usuario+ "Pontos " +Pontos+ "\n"
                + "Quantas pessoas em uma equipe fazem a construção do java"
                + "A) 12 B) 13 C) 15 D) 25 ");
        if("e".equals(fase2)){
            JOptionPane.showMessageDialog(null, "Resposta Certa");
            Pontos=Pontos+1000;
        }
        else{
            JOptionPane.showMessageDialog(null, "Resposta incorreta:");
            Pontos=Pontos/2;
            JOptionPane.showMessageDialog(null, "Sua a Pontuação foi" + Pontos);
            System.exit(0);
        }
        fase2 = JOptionPane.showInputDialog("\n Usuario " +usuario+ "Pontos " +Pontos+ "\n"
        + "Quem foi o lider do projeto Java? \n"        
        + "A)James Gosling \n B)Albert Einstein \n "
        + "C)Platão \n D)Issac Newton ");
        if("a".equals(fase2)){
            JOptionPane.showMessageDialog(null, "Resposta Correta");
            Pontos=Pontos+1000;
        }
        else{
            JOptionPane.showMessageDialog(null, "Resposta incorreta");
            Pontos=Pontos/2;
            JOptionPane.showMessageDialog(null, "Sua Pontuação foi " +Pontos);
            System.exit(0);
        }
        fase2 = JOptionPane.showInputDialog("\n Usuario" +usuario+ "Pontos" +Pontos+ "\n" 
        + "Onde é usada a linguagem JAVA? \n" 
        + "A) É usada p desenvoler aplicações Desktop \n"
        + "B) é usada p fazer pesquisas \n "
        + "C) É usada p criptografar os textos \n "
        + "D) é USADA p criar telas principais \n ");
        if("a".equals(fase2)){
            JOptionPane.showMessageDialog(null,"Resposta correta");
            Pontos=Pontos+1000;
    }
        else{
            JOptionPane.showMessageDialog(null,"Resposta incorreta");
            Pontos=Pontos/2;
            JOptionPane.showMessageDialog(null, "Sua pontuação " +Pontos);
            System.exit(0);
            
        fase2 = JOptionPane.showInputDialog("\n Usuario:" +usuario+ "Pontos" +Pontos+ "\n"
        +"Qual o componente da plataforma java assegura a independência nas plataformas? "
        +"A)Java aplication \n   B)Java Virtual Machine\n "
        +"C)Java ER \n  D)enterprise Edition \n");
        if("b".equals(fase2)){
            JOptionPane.showMessageDialog(null,"Resposta correta");
            Pontos=Pontos+1000;
        }
        else{
            JOptionPane.showMessageDialog(null,"Resposta incorreta");
            Pontos=Pontos/2;
            JOptionPane.showMessageDialog(null,"Sua pontuação" +Pontos);
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null, "PARABÉNS VOCÊ ESTÁ NA ÚLTIMA FASE");
        fase3 = JOptionPane.showInputDialog("\n Usuario " +usuario+ "Pontos" +Pontos+ "\n"
        +"Quantos Catch pode possuir um Try? \n"
        +"A) Apenas um \n B) cinco apenas \n "
        +"C) dez apenas \n D) varios Catch \n");
        if("d".equals(fase3)){
            JOptionPane.showMessageDialog(null,"Resposta Correta");
            Pontos=Pontos+5000;
        }
        else{
            JOptionPane.showMessageDialog(null,"Resposta INcorreta");
            Pontos=Pontos/2;
            JOptionPane.showMessageDialog(null,"Sua pontuação foi" +Pontos);
            System.exit(0);
        }
        JOptionPane.showMessageDialog(null,"PARABÉNS VC GANHOU R$1000000000");
        }
    }
    
}
