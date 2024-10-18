class Solution {
    public boolean FatestisSubsequence(String s, String t){
         // just take the sub sequence and get the position of matching character from the starting position 
         // update the starting position when there is a match
         int start_from = 0;
         for(int i = 0; i < s.length(); i++){
            start_from = t.indexOf(s.charAt(i), start_from);
            if(start_from==-1){
                return false;
            }
            start_from++;
            // need to increament the start value 
            // so that we exculde the already matched value from the search
            // and avoid a test case like
            // s = "aaaaaa"
            // t = "bbaaaa"
         }
         return true;
    } 

    public boolean AlgomapIOisSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp == s.length();        
    }
 }
 