class Solution {
    public boolean isValid(String s) {
        
      boolean b=true;  
    Stack<Character> st=new Stack<>();

    

    for(int i=0;i<s.length();i++)
    {
       char c=s.charAt(i);

       if(c=='(' ||c=='[' ||c=='{' )   // pushing all opening brackets
       {
          st.push(c);
       }


       if((c==')' ||c==']' ||c=='}') && st.size()==0 )
       {
          b=false;                  
          return b;
       }

       if(c=='}')
       {
        if(st.peek()=='{')
        {
           st.pop();
        }
        else
        {
           b=false;   
          return b;
        }
       }

        else if(c==']')
       {
        if(st.peek()=='[')
        {
           st.pop();
        }
        else
        {
         b=false;   
          return b;
        }
       }
        else if(c==')')
       {
        if(st.peek()=='(')
        {
           st.pop();
        }
        else
        {
           b=false;   
          return b;
        }
       }
}

if(st.size()>0)
{
   b=false;   
          return b;
}


          return b;
  
    }
}