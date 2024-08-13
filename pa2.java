import java.util.Scanner;

class pa2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
      //  int n =sc.nextInt();
        for(int i=1;i<=m;i++){
           // System.out.println("**");
            for(int j=1;j<=m;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
