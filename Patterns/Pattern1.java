import java.util.Scanner;

class Pattern1 {
    public static void main(String args[]) {
        int r,c;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}