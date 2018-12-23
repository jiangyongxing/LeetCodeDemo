package com.fengrong.xing;


import java.util.HashSet;

public class Demo6 {


    public static void main(String[] a) {
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));

    }

    public static int uniqueMorseRepresentations(String[] words) {

        String[] alphabets = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> wordTypes = new HashSet<>();

        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = word.toCharArray();
            for (char aChar : chars) {

                stringBuilder.append(alphabets[aChar - 97]);
            }
            wordTypes.add(stringBuilder.toString());
        }
        return wordTypes.size();
    }


}
