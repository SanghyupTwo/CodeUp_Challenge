package codeup_Java;

import java.util.Scanner;

public class Basic_031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.printf("%o", num);        // 10진수 입력받아서 8진수로 출력
    }
}