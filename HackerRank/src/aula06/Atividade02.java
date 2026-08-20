package aula06;

public class Atividade02 {

    public static void main(String[] args){

        long populacaoCidade = 1_5000_000;

        int votosApurados = 1_499_999;
        long totalGeral = votosApurados;

        float mediaNotas = 8;
        double notaFinal = mediaNotas;

        double saldoConta = 2500.75;
        long saldoEmCentavosAproximado = ( long ) ( saldoConta * 100 );

        int quantidadeItens = 10;
        float preocUnitario = 3.5f;
        float totalCompra = quantidadeItens * preocUnitario;

        double mediaFinal = 7.8;
        int mediaParaAprovacao = (int) mediaFinal;

        System.out.println("populacaoCidade = " + populacaoCidade);
        System.out.println("totalGeral = " + totalGeral);
        System.out.println("notaFinal = " + notaFinal);
        System.out.println("saldoEmCentavosAproximado = " + saldoEmCentavosAproximado);
        System.out.println("totalCompra = " + totalCompra);
        System.out.println("mediaParaAprovacao = " + mediaParaAprovacao );




    }
}
