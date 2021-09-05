class Solution {
    public int reverse(int x) {
        int resultNumber = 0;
        boolean isPlus = true;
        
        if (x < 0) {
            isPlus = false;
        }
        
        x = Math.abs(x);
        String number = new StringBuilder(Integer.toString(x)).reverse().toString();
        System.out.println(number);
        
        try {
            resultNumber = Integer.parseInt(number);   
            if (!isPlus) {
                resultNumber*=-1;
            }
            return resultNumber;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}