import java.util.Random;
import java.util.Scanner;

public class VitalMessageFinal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random sorteador = new Random();

        int nivel = 0;
        int i = 0;
        String mensagemSecreta = "";

        int min = 65;
        int max = 90;

        System.out.println("A MENSAGEM VITAL");
        System.out.println();

        while(nivel < 4 || nivel > 10){
            System.out.println("QUAL O SEU NÍVEL DE DIFICULDADE? (4-10)");
            try {
                nivel = leitor.nextInt();
            }catch (Exception e){
                nivel = 0;
            }
        }

        while (i < nivel){
            int numeroSorteado = sorteador.nextInt(max - min + 1) + min;
            System.out.println(numeroSorteado);
            char letra = (char) numeroSorteado;
            mensagemSecreta = mensagemSecreta + letra;
            i = i + 1;
        }

        System.out.println("A MENSAGEM SECRETA É: ");
        System.out.println(mensagemSecreta);

        try {
            Thread.sleep(nivel * 750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        i = 0;

        while (i < 1000){
            System.out.println();
            i++;
        }

        System.out.println("DIGITE A MENSAGEM AGORA!");
        Scanner leitor2 = new Scanner(System.in);
        String mensagem = leitor2.nextLine();

        if (mensagemSecreta.equalsIgnoreCase(mensagemSecreta)){
            System.out.println("VOCÊ ACERTOU!!");
            System.out.println("A GUERRA ACABOU!!");
        } else{
            System.out.println("VOCÊ ERROU!");
            System.out.println("A MENSAGEM SECRETA ERA: " + mensagemSecreta);
        }

    }

}
