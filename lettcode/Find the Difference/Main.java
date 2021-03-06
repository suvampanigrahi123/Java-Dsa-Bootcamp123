/*
Question Link:-https://leetcode.com/problems/find-the-difference
389. Find the Difference
You are given two strings s and t.

String t is generated by random shuffling string s and then add one more letter at a random position.

Return the letter that was added to t.
Example 1:

Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
Example 2:

Input: s = "", t = "y"
Output: "y"
*/
class Main{
    public static void main(String[] args) {
        // String s="abcd";
        // String t="abcde";
        String s="";
        String t="y";
        System.out.println(difference(s, t));
    }
    public static char difference(String s,String t){
        int charCodes=t.charAt(s.length());
        for(int i=0;i<s.length();i++){
            charCodes-=s.charAt(i);
            charCodes+=t.charAt(i);
        }
        return (char)(charCodes);
    }
}