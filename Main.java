import java.util.Scanner;

class basic2 {
    int a = 3;
    int b;
    int c;
    String s;

}

public class Main {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);

        basic2 df = new basic2();
        System.out.println("enter S");
        df.s = sd.next();
        System.out.println("s value " + df.s);

    }
}