/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.kaminich.mathutil.main;

import com.kaminich.mathutil.core.MathUtility;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Test case #1 - Xem chi tiết mô tả ở dưới (case: n = 0 | 0!)
        int n = 0;
        long expected = 1; //0! hy vọng là 1, ko cần lập trình cũng ra kq này
        long actual = MathUtility.getFactorial(n); //0! thực tế là mấy, gọi hàm run là biết ngay
        
        //so sánh giữa expected == actual hay ko???
        System.out.println("0! -> expected = " + expected +
                                    " | actual = " + actual);
        
        //Cách 1: kiểm thử = sức người: mắt nhìn, não nghĩ
        
        //test case #2: Xem mô tả
        
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("1! -> expected = " + expected +
                                    " | actual = " + actual);
        
        //test case #3: mô tả ở dưới

        System.out.println("5! -> expected = 120" +
                            " | actual = " + MathUtility.getFactorial(5));
        
    }

}

//Test case #2: Check getFactorial(with n = 1)
//Step/Procedures:
//  1. Given n = 1
//  2. Invoke/call getFactorial(n = 1)
//Expected result: the method returns 1 stands for 1! = 1
//Status: PASSED? OR FAILED? - to be updated later, when finishing test run

//Test case #3: Check getFactorial(with n = 5)
//Step/Procedures:
//  1. Given n = 5
//  2. Invoke/call getFactorial(n = 5)
//Expected result: the method returns 120 stands for ! = 120
//Status: PASSED? OR FAILED? - to be updated later, when finishing test run


//Dev phải test code của mình, có 3 cách:
//Công việc của QC bao gồm
//Thiết kế TEST CASE, RUN TEST CASE, GHI LẠI BUG NẾU CÓ
//         TEST CASE  TEST RUN           LOG BUG
//Test case: nói ra bạn sẽ test app thế nào
//bằng cách đưa vào data, giá trị kì vọng, cách dùng app với bộ data đó ntn
//Lát hồi run thử app xem sao -> Test run
//Đề thi PE !!! Thiết kế test case
//Ta thiết kế test case để test hàm tính giai thừa ta vừa viết
//Test code thì đc gọi là Unit Test
//Test case cho Unit test thì gọi là "Unit test" test case
//Test case #1: Check getFactorial() with n = 0
//Step/Procedures:
//  1. Given n = 0
//  2. Invoke/call getFactorial(n = 0)
//Expected result: the method returns 1 stands for 0! = 1
//Status: PASSED? OR FAILED? -> lúc chạy mới biết đc kq, gọi là Test run
//                                                 có thể test nhiều lần

