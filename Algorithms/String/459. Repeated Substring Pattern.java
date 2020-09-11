class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        
        for(int i=len/2; i >=1; i--) {
            
            if(len%i == 0) {
                String subStr = s.substring(0, i);
                StringBuilder str = new StringBuilder();
                for(int j=0; j < len/i; j++){
                    str.append(subStr);
                }
                if(str.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}
