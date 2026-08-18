package aula03_Extras;

import java.util.Scanner;

public class triangulo {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        double medida[] = new double[3];
        double perimetro;
        double area;

        for ( int i = 0; i < 3; i++){

            System.out.printf("Entre com o lado %d", i);
            medida[i] = sc.nextDouble();

        }


        boolean isTrue = medida[0] < medida[1] + medida[2] &&
                         medida[1] < medida[2] + medida[0] &&
                         medida[2] < medida[0] + medida[1];

        if ( isTrue){

            perimetro = medida[0] + medida[1] + medida[2];

            System.out.println("Perimetro = " + perimetro);


        }else{

            area = ((medida[0] + medida[1]) * medida[2]) /2 ;

            System.out.println("Area = " + area);
        }









    }
}
