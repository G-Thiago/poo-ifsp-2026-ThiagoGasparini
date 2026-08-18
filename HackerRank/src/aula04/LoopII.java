package aula04;

import java.util.Scanner;

public class LoopII {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        for ( int i = 0; i < q;i++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

                int temp = a;
                for ( int j = 0; j < n; j++){

                    temp += b * (int)Math.pow(2, j);
                    System.out.print(temp + " ");

                }
                System.out.println();

        }

            sc.close();


    }
}
