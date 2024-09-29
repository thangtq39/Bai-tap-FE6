package BTVN01;

import java.util.Scanner;

public class Bai03 {

    public static void main(String[] args){
        //Tạo đối tượng scanner để nhập dữ liệu từ console
        Scanner scanner = new Scanner(System.in);

        //Nhập số thứ nhất
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();

        //Nhập số thứ hai
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        //Nhập số thứ ba
        System.out.print("Nhập số thứ ba: ");
        int num3 = scanner.nextInt();

        //Nhập số thứ tư
        System.out.print("Nhập số thứ tư: ");
        int num4 = scanner.nextInt();
        
       
        //Cách tính
        int max_value = num1;
        if (num2 > max_value) max_value = num2;
        if (num3 > max_value) max_value = num3;
        if (num4 > max_value) max_value = num4;
      
        //in kết quả
        System.out.print("Số lớn nhất trong bốn chữ số là: " + max_value);

    }
}
