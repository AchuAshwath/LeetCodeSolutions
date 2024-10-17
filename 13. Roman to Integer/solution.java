class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'I':
                    result += 1;
                case 'V':
                    if(s.charAt(i-1)== 'I'){
                        result += 3;
                    }else{
                        result += 5;
                    }
                case 'X':
                    result +=10;
                case 'L':
                    result += 50;
                case 'C':
                    result += 100;
                case 'D':
                    result += 500;
                case 'M':
                    result += 1000;
                
            }
        }   
        return result; 
    }
}
