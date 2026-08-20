package aula06;

public class Atividade01 {

    public static void main (String[] args){

        Integer x1 = 127;
        Integer x2 = 127;
        System.out.println("Par dentro da faixa (==): " + (x1 == x2 ));
        System.out.println("Par dentro da faixa (.equals()): " + x1.equals(x2));

        Integer y1 = 131;
        Integer y2 = 131;
        System.out.println ("Par fora da faixa(==) " + (y1 == y2 ));
        System.out.println("Par fora da faixa(.equals()): " + y1.equals(y2));


    }
}
