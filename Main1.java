package src.main;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập 1 số nguyên:");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            System.out.println("Mời bạn nhập số thứ " +(i+1));
            int x =Integer.parseInt(scanner.nextLine());
            arr[i] = x;
        }
        System.out.println("Thêm 1 phần tử vào mảng");
        int[] arrNew = new int[n+1];
        for (int i = 0; i<n; i++){
            arrNew[i] =arr[i];
        }
        int value = Integer.parseInt(scanner.nextLine());
        arrNew[n] = value;
        System.out.println(Arrays.toString(arrNew));
        System.out.println("Mời nhập giá trị sửa:");
        int alter = Integer.parseInt(scanner.nextLine());
        arrNew[n] = alter;
        System.out.println(Arrays.toString(arrNew));
    }
}
