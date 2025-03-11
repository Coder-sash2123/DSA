// Geek for geeks 
// https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1

class Solution {
    static int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        if (n <= 1) return 0; // Already at the last position
        if (arr[0] == 0) return -1; // Can't move at all

        int maxReach = arr[0]; // Max index we can reach
        int steps = arr[0];    // Steps we can still take
        int jumps = 1;         // Number of jumps taken

        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jumps; // Reached the end

            maxReach = Math.max(maxReach, i + arr[i]); // Update max reach
            steps--; // Use one step to move forward

            if (steps == 0) { // Need to jump
                jumps++;
                if (i >= maxReach) return -1; // Can't progress
                steps = maxReach - i; // Reset steps
            }
        }
        return -1; // If end is never reached
        
        
    }
}
