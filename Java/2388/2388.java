import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int tempo, velocidade, distancia = 0;
        int input = sc.nextInt();

        for(int i=0;i<input;i++){
            tempo = sc.nextInt();
            velocidade = sc.nextInt();

            distancia += (tempo * velocidade);
        }

        System.out.printf("%d\n",distancia);

        sc.close();
    }

}