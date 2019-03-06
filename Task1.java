package com.groupqa1;

public class Task1 {

    public static void main(String[] args) {

	String str = "HelloWorld!";
        System.out.println("Unique characters:" + getUnique(str));
    }

    static String getUnique(String str) {
        String resStr = "";
        int index = 0;
        int length = str.length();
        while (index < length) {
            char ch = str.charAt(index);
            int j = 0;
            boolean flag = true;
            while (j < str.length()) {
                if (ch == str.charAt(j) && index != j)
                    flag = false;
                    j++;
            }
            if (flag)
                resStr += ch;
            index++;
        }
        return resStr;

    }

}
