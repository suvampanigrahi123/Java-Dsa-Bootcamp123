import java.util.Stack;

/*
Ques Link:-https://leetcode.com/problems/valid-parentheses/
 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:-
Input: s = "()"
Output: true
*/
class Main{
    public static void main(String[] args) {
        String s="()[]";
        System.out.println(isValid(s));
    }
    /*
    Idea:-
    It's brilliant. The basic idea is to push the right parentheses ')', ']', or '}' into the stack each time when we encounter left ones. And if a right bracket appears in the string, we need check if the stack is empty and also whether the top element is the same with that right bracket. If not, the string is not a valid one. At last, we also need check if the stack is empty.
    */
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(')');
            }
            else if(ch=='['){
                stack.push(']');
            }
            else if(ch=='{'){
                stack.push('}');
            }
            else if(stack.isEmpty() || stack.pop()!=ch) return false;
        }
        return stack.isEmpty();
    }
}