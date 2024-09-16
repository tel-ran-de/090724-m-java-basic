package org.example;

import org.junit.jupiter.api.*;

import static org.example.Main.getArray;
import static org.example.Main.getFirstNum;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private int[] arr;
    private int firstNum;

    @BeforeAll
    static void printBeforeAll() {
        System.out.println("Before all tests");
    }

    @AfterAll
    static void printAfterAll() {
        System.out.println("After all tests");
    }

    @BeforeEach
    void initArray() {
        arr = getArray();
        firstNum = getFirstNum();
        System.out.println("Before each tests");
    }

    @AfterEach
    void print() {
        System.out.println("Test is end");
    }

    @Test
    void getCorrectLengthArrayTest() {
//        int[] arr = getArray();
        assertEquals(3, arr.length);
//        assertTrue(arr.length == 3);
    }

    @Test
    void getNotCorrectLengthArrayTest() {
//        int[] arr = getArray();
        assertNotEquals(5, arr.length);
//        assertFalse(arr.length != 3);
    }

    @Test
    void getNotEmptyArrayTest() {
//        int[] arr = getArray();
        assertNotNull(arr);
    }

    @Test
    void getCorrectFirstElementFromArrayTest() {
//        int[] arr = getArray();
        assertEquals(1, arr[0]);
    }

    @Test
    void getCorrectArrayTest() {
        int[] arrNew = {1, 2, 3};
//        1
        for(int i = 0; i < arr.length; i++) {
            assertEquals(arrNew[i], arr[i]);
        }
//        2
        assertArrayEquals(arrNew, arr);
    }

    @Test
    void getCorrectFirstNum() {
        assertEquals(1, firstNum);
    }
}