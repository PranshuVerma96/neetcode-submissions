class Solution {
    public boolean isValid(String s) {

        // sabse phle stack ko implement karne ke liye deque ko use kare ge 
        Deque<Character> st = new ArrayDeque<>();

        for(char ch : s.toCharArray()){
            // if this is open bracket 
            if(ch== '(' || ch == '[' || ch=='{'){
                // isa he to stack ke ander use push kar do 
                st.push(ch);
            }
            else{
                // if ch is a closing bracket than check karo top bala      bracket same ka opening bracket he to use pop kar do 
// we are going to check stack ka top 
// but check top we should check stack is empty or not 

            if(st.isEmpty()){
                return false;
            }
            // stack empty nahi he but bracket match bi nahi ho rahe 
            if(ch == ')' && st.peek() != '('){
                // no match
                return false;
            }
                
            else if(ch == ']' && st.peek() != '['){
                 // no match
                return false;
            }
                
            else if(ch == '}' && st.peek() != '{'){
                 // no match
                return false;
            }
            else{
                // stack empty bi nahi he match bi nahi 
                // ye case he both bracket are same
                // pop karo 
                st.pop();
            }
                

            }

        }
        // is stack is empty than iska matlab valid expression tha 
        // sab bracket cancel ho gay 

        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
    }
}
