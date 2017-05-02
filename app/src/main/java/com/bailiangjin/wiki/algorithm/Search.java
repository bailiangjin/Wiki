package com.bailiangjin.wiki.algorithm;

/**
 * Created by bailiangjin on 2017/5/2.
 */

public class Search {

    private static int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    /**
     * 二分查找 for递增数列
     *
     * @param array
     * @param start
     * @param end
     * @param key
     * @return
     */
    public static int binarySearch(int[] array, int start, int end, int key) {
        if (start > end) {
            return -1;
        }
        int middleIndex = start + (end - start) / 2;

        if (array[middleIndex] > key) {
            return binarySearch(array, start, middleIndex - 1, key);
        } else if (array[middleIndex] < key) {
            return binarySearch(array, middleIndex + 1, end, key);
        }
        return middleIndex;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        int searchKey = 3;

        int aimIndex = binarySearch(array, 0, array.length - 1, searchKey);
        System.out.println("所查找的数字位于位置" + aimIndex);
    }

}
