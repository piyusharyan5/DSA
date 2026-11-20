package Methods;

import java.util.Scanner;

public class BuiltIn {
    public static void main(String[] args) {
        //Math. Wale
        //System.out.println(Math.cbrt(9));
        //System.out.println(Math.sqrt(9));
        //System.out.println(Math.ceil(9.23));
        //System.out.println(Math.floor(9.24));
        //System.out.println(Math.min(9,4));
        //System.out.println(Math.max(9,5));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = Math.max(a,b);
        System.out.println(Math.max(c,d));
    }
}
