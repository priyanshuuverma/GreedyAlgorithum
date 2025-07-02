// Leetcode : 1710
// Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
// Output: 91


class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b) ->b[1] - a[1]);   //O(N log N)
        int  i = 0;
        int maxValue = 0;
        int maxSize = 0;
        int n = boxTypes.length;
        while(i<n){                                                          //o(N)
            if(maxSize + boxTypes[i][0] <= truckSize){
                maxSize += boxTypes[i][0];
                maxValue += boxTypes[i][0] * boxTypes[i][1];
            } else{
                int res = truckSize - maxSize ;
                maxValue += res * boxTypes[i][1];
                break;
            }
            i++;
        }       
        return maxValue; 
    }
}   

 // total time complexity - > o( n + n log n)  ~~ n log n 
 // total space complexity  -> o(1);
