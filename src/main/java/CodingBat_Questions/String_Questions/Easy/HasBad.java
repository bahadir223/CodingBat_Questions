package CodingBat_Questions.String_Questions.Easy;

public class HasBad {
    /*

    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
    Note: use .equals() to compare 2 strings.


    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false
     */

    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));

    }
    public static boolean hasBad(String str) {
        int kacinciIndex=str.indexOf("bad");
        if(kacinciIndex==0||kacinciIndex==1){
            return true;
        }else{
            return false;
        }
    }

}
