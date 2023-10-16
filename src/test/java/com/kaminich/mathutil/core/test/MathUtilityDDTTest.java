/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.kaminich.mathutil.core.test;

import com.kaminich.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author DELL
 */
public class MathUtilityDDTTest {

    // ta tách data kiểm thử ra khỏi câu lệnh ss 
    // kĩ thuật này gọi là DDT (Data Driven Testing)
    // kiểm thử hàm, app mà tách riêng bộ data ra một chỗ để  dễ kiểm soát
    // sự thiếu đủ của các test case, các test data
    // data test ta để riêng ra 1 chỗ, thường là mảng, hay file Excel
    // hoặc table
    //0! -> 1
    //1! -> 1
    // ....
    // thấy mùi của mảng 2 chiều
    public static Object[][] initData() {
        // int[] a = { phần tử của mảng 1 chiều cách nhau dấu phẩy 5, 10, 15};

        Object[][] testData = {{0, 1},
                               {1, 1},
                               {2, 2},
                               {4, 24},
                               {5, 120}
                //n expected
        };
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnOk(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

}
