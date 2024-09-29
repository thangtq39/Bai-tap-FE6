package BTVN01;

import java.util.Scanner;

public class Bai02 {
    
     public static void main(String[] args) {
        //Tạo đối tượng scanner để nhập dữ liệu từ console
        Scanner scanner = new Scanner(System.in);

        // Bán kính hình tròn
        System.out.print("Nhập bán kính hình tròn: ");
        double r = scanner.nextInt();
 
        // Phép tính
        double Area = r * 2 * 3.14;
        double Perimeter = r * r * 3.14;

        // Hiển thị kết quả
        System.out.println("Chu vi của hình tròn là: " + Area);

        System.out.println("Diện tích của hình tròn là: " + Perimeter);
    }

}

