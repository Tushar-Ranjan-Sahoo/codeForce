import java.util.*;

public class Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();

            int count = 0 ,ans=0;
            boolean isThree = false;

            for(char ch : name.toCharArray()){
                if(ch == '.'){
                    count++;
                    ans++;

                }else{
                    count = 0;
                }

                if(count == 3){
                    isThree = true;
                    break;
                }
            }
            if(isThree){
                System.out.println(2);
            }
            else{
                System.out.println(ans);
            }
        }
    }
}
