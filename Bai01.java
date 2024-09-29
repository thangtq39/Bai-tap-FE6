package BTVN01;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        //Tạo đối tượng scanner để nhập dữ liệu từ console
        Scanner scanner = new Scanner(System.in);

        // Chiều dài hình chữ nhật
        System.out.println("Nhập chiều dài: ");
        int a = scanner.nextInt();

        // chiều rộng hình chữ nhật
        System.out.println("Nhập chiều rộng: ");
        int b = scanner.nextInt();

        // Phép tính
        int Area = a * b;
        int Perimeter = (a + b) * 2;

        // Hiển thị kết quả
        System.out.println("Diện tích của hình chữ nhật là: " + Area);
        System.out.println("Chu vi của hình chữ nhật là: " + Perimeter);
    }
}
