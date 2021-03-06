package com.bailiangjin.wiki.algorithm;

/**
 * Created by bailiangjin on 2017/5/1.
 */

public class Sort {

    private static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};


    /**
     * 归并排序
     * @param arr
     * @param result
     * @param start
     * @param end
     */
    private static void merge_sort_recursive(int[] arr, int[] result, int start, int end) {
        if (start >= end)
            return;
        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        merge_sort_recursive(arr, result, start1, end1);
        merge_sort_recursive(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2)
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        while (start1 <= end1)
            result[k++] = arr[start1++];
        while (start2 <= end2)
            result[k++] = arr[start2++];
        for (k = start; k <= end; k++)
            arr[k] = result[k];
    }

    public static void merge_sort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        merge_sort_recursive(arr, result, 0, len - 1);
    }


    /**
     * 插入排序
     *
     * @param array
     */
    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j - 1] < array[j]) {
                    break;
                }
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
        }

    }

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


    /**
     * @param args
     */
    public static void main(String[] args) {
        printArray(array);

        //bubbleSort(array);
        //simpleSelectSort(array);
        //insertSort(array);
        //quickSort(array, 0, array.length - 1);
        merge_sort(array);

        printArray(array);
    }
}
