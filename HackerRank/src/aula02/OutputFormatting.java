package aula02;

import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.printf( s1 );

            int tamanho = s1.length();
            for ( int j = 0; j < 16 - tamanho; j++ ){

                System.out.print(" ");
            }
            System.out.printf ("%03d\n", x );
        }
        System.out.println("================================");

    }
}
