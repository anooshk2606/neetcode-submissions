class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }
         int[] count2 = new int[26];
        for(char c2 : t.toCharArray()){
            count2[c2 - 'a']++;
        }
        
        return Arrays.equals(count,count2);
    }
}
