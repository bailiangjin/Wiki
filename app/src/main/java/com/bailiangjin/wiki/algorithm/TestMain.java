package com.bailiangjin.wiki.algorithm;

/**
 * Created by bailiangjin on 2017/5/3.
 */

public class TestMain {

    /**
     * @param args
     */
    public static void main(String[] args) {

        String url="productInfo:id|3gURL|pcURL|IMAGE|NAME";
        parseUrl(url);
    }

    private static String[] parseUrl(String url) {
        if (null!=url&&url.startsWith("productInfo")) {
            url = url.replace("productInfo:", "");
            String[] paramArray = url.split("\\|");

            for (String item:paramArray) {
                System.out.println(item);
            }
            return paramArray;
        }

        return null;
    }
}
