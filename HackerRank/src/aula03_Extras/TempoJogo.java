package aula03_Extras;

import java.util.Scanner;

public class TempoJogo {

    public static void main (String[]args){

      int DuracaoMin; int HorasTot; int MinTot;

      Scanner sc = new Scanner(System.in);

         int horaInico = sc.nextInt();
         int minutoInicio = sc.nextInt() + (horaInico * 60);
         int horaFim = sc.nextInt();
         int minutoFim = sc.nextInt() + (horaFim * 60);


      DuracaoMin = minutoFim - minutoInicio;
      if (DuracaoMin <= 0){
          DuracaoMin += 24 * 60;
      }

      HorasTot = DuracaoMin / 60;
      MinTot = DuracaoMin % 60;

      System.out.printf ("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", HorasTot, MinTot);






    }


}
