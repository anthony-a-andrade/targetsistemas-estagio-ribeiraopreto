import java.util.Scanner;

/*
1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
*/

public class ex1 {
    private static boolean fib(int n0, int n1, int check) {
        if (n0 == check) return true;
        if (n0 > check) return false;

        return fib(n1, n0 + n1, check);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o valor... ");
        int num = sc.nextInt();
        boolean pertence = fib(0, 1, num);
        System.out.println(String.format("%d %s a sequência de Fibonacci.", num, pertence ? "pertence" : "não pertence"));
    }
}
