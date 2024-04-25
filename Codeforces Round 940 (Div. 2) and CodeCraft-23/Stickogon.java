import java.util.*;

public class Stickogon{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            Map<Integer,Integer> count = new HashMap<>();
            for(int e :a){
                count.put(e,count.getOrDefault(e, 0)+1);

            }
            int ans = 0;
            for(Map.Entry<Integer,Integer> entry:count.entrySet()){
                ans +=entry.getValue()/3;
            }
            System.out.println(ans);
           
        }
    }
}