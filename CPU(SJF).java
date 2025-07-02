// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int time = 0 ;
        int waitingtime = 0 ;
        for(int i = 0; i<bt.length; i++){
            waitingtime += time;
            time += bt[i];
        }
        return waitingtime/bt.length;
    }
}
