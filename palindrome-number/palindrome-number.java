class Solution {
    public boolean isPalindrome(int x) {
        String xToString = Integer.toString(x);
        String xReverseToString = new StringBuilder(xToString).reverse().toString();
        return xToString.equals(xReverseToString);
    }
}