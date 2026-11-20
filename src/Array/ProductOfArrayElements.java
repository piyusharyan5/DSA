package Array;

import java.util.Scanner;

public class ProductOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i =0;i<n;i++){
            arr [i] = sc.nextInt();
        }
        int mul = 1;
        for(int i =0;i<n;i++){
            mul *= arr[i];
        }
        System.out.println(mul);

    }
}
