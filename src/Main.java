import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int i;

        do {
            System.out.println("GERADOR DE NÚMEROS DA MEGA SENA");
            System.out.println("DIGITE 0 PARA FINALIZAR O PROGRAMA");
            System.out.println("DIGITE 1 PARA GERAR SOMENTE NÚMEROS ALEATÓRIOS");
            System.out.println("DIGITE 2 PARA GERAR SOMENTE NÚMEROS ÍMPARES");
            System.out.println("DIGITE 3 PARA GERAR SOMENTE NÚMEROS PARES");
            i = scan.nextInt();

            switch (i) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    System.out.println("GERADOS SOMENTE NÚMEROS ALEATÓRIOS");
                    int[] mega = {
                            random.nextInt(100),
                            random.nextInt(100),
                            random.nextInt(100),
                            random.nextInt(100),
                            random.nextInt(100),
                            random.nextInt(100),
                    };

                    for (int j = 0; j < mega.length; j++) {
                        System.out.println(mega[j]);
                    }
                }
                case 2 -> {
                    System.out.println("GERADOS SOMENTE NÚMEROS ÍMPARES");

                    int[] mega = {
                            random.nextInt(50) * 2 + 1,
                            random.nextInt(50) * 2 + 1,
                            random.nextInt(50) * 2 + 1,
                            random.nextInt(50) * 2 + 1,
                            random.nextInt(50) * 2 + 1,
                            random.nextInt(50) * 2 + 1,
                    };

                    for (int j = 0; j < mega.length; j++) {
                        System.out.println(mega[j]);
                    }
                }
                case 3 -> {
                    System.out.println("GERADOS SOMENTE NÚMEROS PARES");

                    int[] mega = {
                            random.nextInt(51) * 2,
                            random.nextInt(51) * 2,
                            random.nextInt(51) * 2,
                            random.nextInt(51) * 2,
                            random.nextInt(51) * 2,
                            random.nextInt(51) * 2,
                    };

                    for (int j = 0; j < mega.length; j++) {
                        System.out.println(mega[j]);
                    }
                }
                default ->
                    System.out.println("valor inválido digite somente valores entre 0 e 3!");

            }
        } while( i != 0);
    }
}