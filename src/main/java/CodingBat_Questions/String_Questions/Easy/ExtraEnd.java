package CodingBat_Questions.String_Questions.Easy;

public class ExtraEnd {
    /*

    Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.


    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
     */

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));

    }

    public static String extraEnd(String str) {
        return str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);
    }

}