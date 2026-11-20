package Methods;

public class PassByValueAndReference {
    public static int change(int x){
        x=20;
        return 10;
    }
    public static void main(String[] args) {
        int x =10;
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
