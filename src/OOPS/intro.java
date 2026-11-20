package OOPS;

public class intro {
         public static int sleep(int age){
             if (age > 18){
                 return 0;
             }
             else {
                 return 1;
             }

         }

    public static void main(String[] args) {
        int id = 1, nos= 4, age=20;
        String name = "chacha";

        int bhadiya = sleep(age);
        System.out.println(bhadiya);
    }
}
