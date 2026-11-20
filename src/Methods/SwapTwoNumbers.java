package Methods;

public class SwapTwoNumbers {
    public static int swap (int a,int b){
        int temp =a;
        a =b;
        b = temp;
        return 0;
    }
    public static void main(String[] args) {
        int a = 10; int b = 20;
        swap(a,b);
        System.out.println(a+" "+b);
    }
}
