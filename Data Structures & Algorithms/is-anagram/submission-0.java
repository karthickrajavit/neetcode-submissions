class Solution {
    public boolean isAnagram(String s, String t) {
            Map<Character,Integer> freq = new HashMap<>();
            for(Character c:s.toCharArray()){
                freq.put(c,freq.getOrDefault(c,0)+1);
            }
            for(Character c:t.toCharArray()){
                freq.put(c,freq.getOrDefault(c,0)-1);
            }
            System.out.println(freq);
            return freq.values().stream().allMatch(value -> value==0);
        }
}
