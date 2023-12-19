import java.util.Scanner;
import java.util.TreeMap;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x,y;
    TreeMap<Integer, Integer> hMap = new TreeMap<>();
    
    for (int i = 0; i < n; i++) {
      x = sc.nextInt();

      if (hMap.containsKey(x)){
        y = hMap.get(x) + 1;
        hMap.put(x, y);
      }
      else{
        hMap.put(x, 1);
      }
    }

    for (Integer key : hMap.keySet()) {
        System.out.printf("%d aparece %d vez(es)\n",key, hMap.get(key));
    }

    sc.close();
  }
}