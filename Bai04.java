package BTVN01;

import java.util.Scanner;
import java.util.scanner;

public class Bai04 {
    public static void main(String[] args){
        //Tạo đối tượng scanner
        Scanner scanner = new Scanner(System.in);

        //Nhập số dương bất kỳ
        System.out.print("Nhập số dương bất kỳ: ");
        double number = scanner.nextByte();

        //Cách tính
        double squareRoot = Math.sqrt(number);
        String result = String.format("%.3f",squareRoot);

        // Hiển thị kết quả
        System.out.println("Kết quả sau khi làm tròn số: " + result);

    }
}
