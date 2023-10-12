package com.kaminich.mathutil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.kaminich.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {

    //Test case template/structure
//ID | DESC | STEP/PROCEDURES | EXPECTED RESULT | STATUS (PASSED/FAILED)
//Test case #1: Verify the getFactorial() function with n = 0
//Steps/Procedures
//	1. given n = 0
//	2. call/invoke getFactorial(int n)
//EXPECTED RESULT
//	The method getFactorial(n = 0) must return 1 as the result of 0! == 1
//Status: PASSED/FAILED đoán xem khi chạy app, hàm method
    @Test //dính dáng đến Thuật ngữ Framework
    public void verifyFactorialGivenRightArgument0ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

//Test case #2: Verify the getFactorial() function with n = 0
//Steps/Procedures
//	1. given n = 1
//	2. call/invoke getFactorial(int n)
//EXPECTED RESULT
//	The method getFactorial(n = 1) must return 1 as the result of 1! == 1
//Status: PASSED/FAILED
    @Test
    public void verifyFactorialGivenRightArgument1ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

//Test case #3: Verify the getFactorial() function with n = 6
//Steps/Procedures
//	1. given n = 6
//	2. call/invoke getFactorial(int n)
//EXPECTED RESULT
//	The method getFactorial(n = 6) must return 1 as the result of 6! == 720
//Status: PASSED/FAILED
    @Test
    public void verifyFactorialGivenRightArgument6ReturnOk() {
        assertEquals(720, MathUtility.getFactorial(6));
    }

}
