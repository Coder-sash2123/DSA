// Geeks for geeks 
// Print the Factorials of a number which is less then n is Less than or Equal to n
//https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1

// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> result = new ArrayList<>();
        factorialHelper(1, 1, n, result); 
        return result;
    }

    private static void factorialHelper(long i, long fact, long n, ArrayList<Long> result) {
        if (fact > n) {
            return; 
        }
        result.add(fact); 
        factorialHelper(i + 1, fact * (i + 1), n, result); 
    }
}
