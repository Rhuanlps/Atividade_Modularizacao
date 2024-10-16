public class Modularizacao_05 {
    public static void main(String[] args) {
        boolean resultado = ePar(8);
        System.out.println("O número é par? " + resultado);
    }

    public static boolean ePar(int numero) {
        return numero % 2 == 0;
    }
}