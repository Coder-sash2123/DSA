// Leetcode 
// String is a Palindrome or not 
// https://leetcode.com/problems/valid-palindrome/description/

class Solution {
    public boolean isPalindrome(String s) {
        return checkPalindrome(0, s.length() - 1, s);
    }

    public boolean checkPalindrome(int i, int n, String s) {
        if (i >= n) return true;

        // Skip non-alphanumeric characters
        if (!Character.isLetterOrDigit(s.charAt(i))) return checkPalindrome(i + 1, n, s);
        if (!Character.isLetterOrDigit(s.charAt(n))) return checkPalindrome(i, n - 1, s);

        // Compare characters
        if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(n))) return false;

        // Continue recursion
        return checkPalindrome(i + 1, n - 1, s);
    }
}



// my code work needed little 

class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        boolean ans = checkPalindrome(0,n,s);
        return ans;
    }
    public boolean checkPalindrome(int i, int n, String s){
        if(i>=n/2) return true;
        else if (!Character.isLetterOrDigit(s.charAt(i))) i++;
        else if (!Character.isLetterOrDigit(s.charAt(n-1))) n--;
        else if (Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(n-i-1))) {
            System.out.print(s.charAt(i) + " " + s.charAt(n-i- 1));
            return false;}
        else {
            i ++;
            n--;
        }
        System.out.println(s.charAt(i) + " " + s.charAt(n-i- 1));
        return checkPalindrome(i,n,s);
    }
}
