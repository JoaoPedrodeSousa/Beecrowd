import java.util.Scanner;

public class A1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0;

        int value = sc.nextInt();
        System.out.printf("%d\n",value);

        while (value != 0){
            if (value > 100) {
                cem += 1;
                value -= 100;
            } else if (value >= 50) {
                cinquenta += 1;
                value -= 50;
            } else if (value >= 20) {
                vinte += 1;
                value -= 20;
            } else if (value >= 10) {
                dez += 1;
                value -= 10;
            } else if (value >= 5) {
                cinco += 1;
                value -= 5;
            } else if (value >= 2) {
                dois += 1;
                value -= 2;
            } else if (value == 1) {
                um += 1;
                value -= 1;
            }
        }
        System.out.printf("%d nota(s) de R$ 100,00\n",cem);
        System.out.printf("%d nota(s) de R$ 50,00\n",cinquenta);
        System.out.printf("%d nota(s) de R$ 20,00\n",vinte);
        System.out.printf("%d nota(s) de R$ 10,00\n",dez);
        System.out.printf("%d nota(s) de R$ 5,00\n",cinco);
        System.out.printf("%d nota(s) de R$ 2,00\n",dois);
        System.out.printf("%d nota(s) de R$ 1,00\n",um);


        sc.close();
    }
}

