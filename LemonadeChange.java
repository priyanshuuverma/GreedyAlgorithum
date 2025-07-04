class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int i = 0;
        int n = bills.length;
        while(i<n){
            if(bills[i] == 5){
                five++;
            }
            if(bills[i] == 10){
                ten++;
                if(five > 0 ) five--;
                else return false;
            }
            if(bills[i] == 20){
                if(ten > 0){
                    ten--;
                    if(five > 0) five--;
                    else return false;
                } else{
                    if(five >= 3){
                        five -= 3;
                    } else{
                        return false;
                    }
                }
            }
            i++;
        }
        return true;
    }
}
