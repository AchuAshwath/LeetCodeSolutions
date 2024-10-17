class Solution {
    public String mergeAlternately(String word1, String word2) {
        int Word1Length = word1.length(), Word2Length = word2.length();
        int Word1Slider = 0, Word2Slider = 0;
        StringBuilder result = new StringBuilder();
        while(Word1Slider < Word1Length && Word2Slider < Word2Length){
            result.append(word1.charAt(Word1Slider++));
            result.append(word2.charAt(Word2Slider++));
        }
        while(Word1Slider < Word1Length){
            result.append(word1.charAt(Word1Slider++));
        }
        while(Word2Slider < Word2Length){
            result.append(word2.charAt(Word2Slider++));
        }
        return result.toString();
    }
}