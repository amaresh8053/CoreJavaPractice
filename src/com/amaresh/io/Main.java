package com.amaresh.io;

import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String sentence = s.nextLine();
        System.out.println(findLongestEvenWord(sentence));
    }

    public static String findLongestEvenWord(String sentence) {
        String result="";
        int tempLength=0;
        if(sentence.length()==0)
            return result;
        StringTokenizer st = new StringTokenizer(sentence," ");
        while (st.hasMoreTokens()) {
            String word=st.nextToken();
            if(word.length() % 2 == 0 && tempLength<word.length()){
                result=word;
                tempLength=word.length();
            }
        }
        return result;
    }
}

















