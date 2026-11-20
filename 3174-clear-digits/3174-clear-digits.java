class Solution {
    public String clearDigits(String s) {

        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){

            if(!st.empty() && Character.isDigit(ch))st.pop();
            else st.push(ch);
        }
        String s1="",s2="";
        while(!st.empty()){
             s1+=st.peek();
             st.pop();
        }
        int i=s1.length()-1;
        while(i>=0){

            s2+=s1.charAt(i);
            i--;
        }
        return s2;
        
        
    }
}

