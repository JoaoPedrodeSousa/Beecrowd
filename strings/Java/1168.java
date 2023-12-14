import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Para executar esse codigo, eh necessario mudar o nome do arquivo e da classe para 'Main'
public class A1168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> leds = new ArrayList<>();
        int length = sc.nextInt();

        for (int j=0;j<length;j++) {
            String string = sc.next();
            char[] d = string.toCharArray();

            int mount = 0;
            for(char c : d){
                switch (c){
                    case '1':
                        mount += 2;
                        break;

                    case '2', '3', '5':
                        mount += 5;
                        break;

                    case '4':
                        mount += 4;
                        break;

                    case '6', '9', '0':
                        mount += 6;
                        break;

                    case '7':
                        mount += 3;
                        break;

                    case '8':
                        mount += 7;
                        break;

                    default:
                        break;
                }
            }

            leds.add(mount);
        }

        for (Integer led : leds) {
            System.out.printf("%d leds\n", led);
        }

        sc.close();
    }
}