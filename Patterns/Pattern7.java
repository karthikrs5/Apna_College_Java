import java.util.Scanner;
public class Pattern7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            //Space
            // for(int k=n-1;k>=i;k--){
            //     System.out.print(" ");
            // }
            
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
