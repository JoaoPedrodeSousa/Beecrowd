import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> result = new ArrayList<>();
    
    while(true){
      int n = sc.nextInt();
      int k = sc.nextInt();

      if(n == 0 && k == 0){
        break;
      }
      
      HashMap<Integer, Integer> hMap = new HashMap<>();
      
      for (int i = 0; i < n; i++) {
        int x = sc.nextInt();

        if (hMap.containsKey(x)){
          hMap.put(x, hMap.get(x) + 1);
        }

        else{
          hMap.put(x, 1);
        }
      }

      int count = 0;
      for (Integer integer : hMap.values()) {
        if(integer >= k){
          count += 1;
        }
      }
    
      result.add(count);
    }
    result.forEach((integer) -> System.out.printf("%d\n",integer));

    sc.close();

  }  
}