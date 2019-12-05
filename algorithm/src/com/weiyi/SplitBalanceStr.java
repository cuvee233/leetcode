package com.weiyi;

/**
 * @author weiyi
 * @since 2019/12/5 - 23:33
 */
public class SplitBalanceStr {

    public static void main(String[] args) {
        String s = "LLLLRRRRLR";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {

        char[] strArray = s.toCharArray();
        int count = -1;

        for (int i = 0; i < strArray.length - 1; i ++) {
        if (strArray[i] != strArray[i + 1]) {
            count ++;
        }
        }
        return count;
    }

}
