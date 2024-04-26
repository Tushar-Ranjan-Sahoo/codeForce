import java.util.*;

public class Jagged_Swaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ;i<n;i++){
                arr[i] = sc.nextInt();

            }
            int min = Integer.MAX_VALUE;
            for(int num : arr){
                min = Math.min(min,num);
            }
            if(arr[0]!=min){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
