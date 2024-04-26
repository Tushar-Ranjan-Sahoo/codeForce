import java.util.*;

public class A_BIT_of_a_Construction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = 1;
            }
            k -= n;
            for (int j = 30; j >= 0; j--) {
                int cnt = Math.min((k >> j), n);
                for (int l = 0; l < cnt; l++) {
                    a[l] |= (1 << j);
                }
                k -= (cnt << j);
            }
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}