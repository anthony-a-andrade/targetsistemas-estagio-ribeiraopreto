import java.util.Scanner;

/*
2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
*/

public class ex2 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe o texto... ");
        String txt = sc.nextLine();

        long qnt = txt.toLowerCase()
            .chars()
            .filter((chr) -> chr == 'a')
            .count();

        if (qnt == 0) {
            System.out.println("A letra 'a' não existe no texto informado.");
        } else {
            System.out.println(String.format("No texto informado, a letra 'a' aparece %d vezes.", qnt));
        }
    }    
}
