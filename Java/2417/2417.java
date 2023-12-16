import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String informacoes = sc.nextLine();
        sc.close();

        List<Integer> informacoesTime = informacoesTime(informacoes);

        List<Integer> cormengo = informacoesTime.subList(0,3);
        List<Integer> flaminthians = informacoesTime.subList(3,6);

        int pontosVitoriasCormengo = cormengo.get(0) * 3;
        int pontosVitoriasFlaminthians = flaminthians.get(0) * 3;
        int pontosEmpateCormengo = cormengo.get(1);
        int pontosEmpateFlaminthians = flaminthians.get(1);
        int saldoGolCormengo = cormengo.get(2);
        int saldoGolFlaminthians = flaminthians.get(2);

        int pontosCormengo = pontosEmpateCormengo + pontosVitoriasCormengo;
        int pontosFlaminthians = pontosEmpateFlaminthians + pontosVitoriasFlaminthians;

        if ((pontosCormengo > pontosFlaminthians) || (saldoGolCormengo > saldoGolFlaminthians && pontosCormengo == pontosFlaminthians)){
            System.out.printf("C\n");
        }

        else if ((pontosFlaminthians > pontosCormengo) || (saldoGolFlaminthians > saldoGolCormengo && pontosFlaminthians == pontosCormengo)){
            System.out.printf("F\n");
        }

        else{
            System.out.printf("=\n");
        }

    }

    public static List<Integer> informacoesTime(String informacoes){
        List<Integer> time = new ArrayList<>();
        for(String string : informacoes.split(" ")){
            time.add(Integer.parseInt(string));
        }
        return time;
    }
}