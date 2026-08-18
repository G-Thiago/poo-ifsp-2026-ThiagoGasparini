package aula04;

import java.util.Scanner;

public class EndOfFile {

    public static void main (String[] args){

        int i = 1;
        Scanner sc = new Scanner(System.in);

        while ( sc.hasNext()){

            String linha = sc.nextLine();
            System.out.println(i + " " + linha);
            i++;

        }

        sc.close();

    }
}
