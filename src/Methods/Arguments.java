package Methods;

public class Arguments {
    public static void main(String[] args) {
        System.out.println(max(5, 8, -2)); //Parameters

    }

    public static int max(int a, int b, int c) {
        if (a >= b && c >= a) return c; //Arguments
        else if (b >= a && b >= c) return b;
        else return a;

    }
}