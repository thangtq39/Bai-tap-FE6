package BTVN01;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args){
        //Tạo đối tượng scanner
        Scanner scanner = new Scanner(System.in);

        //Nhập số dương bất kỳ
        System.out.print("Nhập số dương thứ nhất: ");
        double num1 = scanner.nextByte();
        System.out.print("Nhập số dương thứ hai: ");
        double num2 = scanner.nextByte();

        //Cách tính
        double division = num1 / num2;
        String result = String.format("%.3f",division);

        // Hiển thị kết quả
        System.out.println("Kết quả sau khi làm tròn số: " + result);

    }
}
