package com.fengrong.xing;


public class Demo9 {

    public static void main(String[] a) {

        int result = hammingDistance(1, 4);
        System.out.println(result);
    }


    public static int hammingDistance(int x, int y) {

//        int a = x ^ y;
//        String s = Integer.toBinaryString(a);
//        char[] chars = s.toCharArray();
//        int size = 0;
//        for (char aChar : chars) {
//            if (aChar == '1'){
//                size++;
//            }
//        }

        return Integer.bitCount(x^y);
    }


}
