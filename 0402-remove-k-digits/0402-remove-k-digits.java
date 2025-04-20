class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> mystack = new Stack<>();
        
        for (char c : num.toCharArray()) {
            while (!mystack.isEmpty() && k > 0 && mystack.peek() > c) {
                mystack.pop();
                k--;
            }
            
            if (!mystack.isEmpty() || c != '0') {
                mystack.push(c);
            }
        }
        
        while (!mystack.isEmpty() && k-- > 0) {
            mystack.pop();
        }
        
        if (mystack.isEmpty()) {
            return "0";
        }
        
        StringBuilder result = new StringBuilder();
        while (!mystack.isEmpty()) {
            result.append(mystack.pop());
        }
        
        result.reverse();
        
        return result.toString();
    }
}