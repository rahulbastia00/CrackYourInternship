class Solution {
    public String reverseWords(String s) {
        String resStr="";
         String resStr1="";
        for(int i=0;i<s.length()-1;i++){

            if(s.charAt(i)!=' ')
                resStr1=resStr1+s.charAt(i);
            else if( s.charAt(i)==' '&&s.charAt(i+1)!=' '&& resStr1!=""){
                
                resStr=' '+resStr1+resStr;
                resStr1="";
                
        
            }
        }
        if( s.charAt(s.length()-1)!=' '){
            resStr1=resStr1+s.charAt(s.length()-1);
         resStr=resStr1+resStr;
        }
        else{
            resStr=resStr1+resStr;
        }
       return resStr; 
    }
}
