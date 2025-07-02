class Solution {
  
    public static int findContentChildren(int[] g, int[] s) 
    {
        Arrays.sort(g);
        Arrays.sort(s);

        int l = 0;
        int r = 0;
        int m = s.length;
        int n = g.length;
        while(l<m && r< n){
            if(s[l] >= g[r]){
                r+= 1;
            }
             l+=1;
        }        
        return r;
    }
}
