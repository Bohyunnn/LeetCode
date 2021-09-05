class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumber = new HashMap<>();
        romanNumber.put('I', 1);
        romanNumber.put('V', 5);
        romanNumber.put('X', 10);
        romanNumber.put('L', 50);
        romanNumber.put('C', 100);
        romanNumber.put('D', 500);
        romanNumber.put('M', 1000);
        
        int sum = 0;
        int i = 0;
        for (i=0; i< s.length()-1; i++) {
            if (romanNumber.get(s.charAt(i)) >= romanNumber.get(s.charAt(i+1))) {
                sum += romanNumber.get(s.charAt(i));
            } else {
                sum += romanNumber.get(s.charAt(i+1)) - romanNumber.get(s.charAt(i));
                i++;
            }
        }
        
        if (s.length() == i+1) {
            sum += romanNumber.get(s.charAt(i));
        }
        
        return sum;
    }
}