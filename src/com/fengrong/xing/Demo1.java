package com.fengrong.xing;

//709. 转换成小写字母
public class Demo1 {


    /**
     * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
     *
     * @param str
     */
    public static void main(String[] str) {
        String a = "Hello";
        System.out.println(toLowerCase(a));
    }

    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
