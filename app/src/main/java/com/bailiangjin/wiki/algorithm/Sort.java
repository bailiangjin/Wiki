package com.bailiangjin.wiki.algorithm;

/**
 * Created by bailiangjin on 2017/5/1.
 */

public class Sort {

    private static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    /**
     * 冒泡排序
     *
     * @param array
     */
    public static void bubbleSort(int[] array) {
        int maxIndex = array.length - 1;

        for (int i = 0; i < maxIndex; i++) {
            for (int j = 0; j < maxIndex - i; j++) {
                if (array[j] > array[j + 1]) {
                    System.out.println("i=" + i + " j=" + j + "  j+1=" + (j + 1));
                    //交换左右值
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    /**
     * 快速排序
     *
     * @param array 数组
     * @param left  低位
     * @param right 高位
     */
    public static void quickSort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int pivot = array[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (array[j] >= pivot && i < j) {
                j--;
            }

            while (array[i] <= pivot && i < j) {
                i++;
            }

            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        //i==j
        array[left] = array[i];
        array[i] = pivot;
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);

    }

    /**
     * 简单选择排序
     *
     * @param array
     */
    public static void simpleSelectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int curMinIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    curMinIndex = j;
                }
            }
            if (curMinIndex != i) {
                int temp = array[i];
                array[i] = array[curMinIndex];
                array[curMinIndex] = temp;
            }
        }
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        printArray(array);

        //bubbleSort(array);
        //simpleSelectSort(array);
        quickSort(array, 0, array.length - 1);

        printArray(array);
    }

    private static void printArray(int[] array) {
        if (null == array || 0 == array.length) {
            System.out.print("数组为空");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i]);
            }
        }
    }


    public static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
