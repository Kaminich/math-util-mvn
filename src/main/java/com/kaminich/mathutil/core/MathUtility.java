/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaminich.mathutil.core;

/**
 *
 * @author DELL
 */
// class này chứa các hàm static dùng chung cho mọi nơi
// khi nào dùng static: khi ta làm các hàm mà chỉ xử lí xong rổi return
// ko cần lưu trữ lại thông tin vào instance variable - đặc tính của object
public class MathUtility {

    public static final double PI = 3.14;

    //C# public const double PI = 3.14; static hiểu ngầm
    //Hàm tính n! = 1.2.3...n
    //ko tính đc giai thừa số âm
    //0! = 1! = 1 quy ước 0! là 1
    //vì hàm giai thừa tăng rất nhanh, 21! kiểu long ko chứa nổi (vượt 18 số 0)
    //do đó hàm getF() của chúng ta chỉ chơi 
    
    // 5! = 1.2.3.4.5
    // 5! = 4! x 5 = 5 x 4!
    // 4! = 1.2.3.4
    // 4! = 3! x 4 = 4 x 3!
    // N! = N x (N-1)! -> Cthuc đệ quy xuất hiện
    // Đệ quy - Recursion - Gọi lại hàm đó
    
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        }
        if (n == 0 || n == 1) {
            return 1; //nếu n đặc biệt, ta return sớm
        }
        
        return n * getFactorial(n - 1);
        // tối ưu code, thay ruột của hàm để chạy ngon hơn
        // nhanh hơn hoặc fix bug thì sửa code
        // dù bạn sửa code vì lí do j, code phải đc test lại
        // và test lại để đảm bảo rằng nó vẫn xanh như lần trc
        // nếu ta viết code đi kèm test script thì việc test lại cái
        // hàm sẽ cực nhanh, ko cần dùng mắt để dò từng dòng lệnh đúng
        // sai, mà chỉ cần màu xanh là đủ - vì hàm trả về như expected
        // test lại những gì đã test - REGRESSION TEST (KIỂM THỬ HỒI QUY)
        // ta chỉ cần màu xanh, hoặc nhận email chửi vì code đỏ
        
    }
    
    
    
//    public static long getFactorial(int n) {
//
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n. n must be 0..20");
//        }
//        if (n == 0 || n == 1) {
//            return 1; //nếu n đặc biệt, ta return sớm
//        }
//
//        long result = 1;//sống sót đến lệnh này, sure n = 1..20
//
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//
//        return result;
//    }
}
