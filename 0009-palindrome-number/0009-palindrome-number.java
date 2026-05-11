class Solution {
    public boolean isPalindrome(int x) {
       int  rev= x;
       int a=0;
        while(rev>0){
            a=a*10+rev%10;
            rev/=10;
        }
        if(a==x){
            return true;
        }
        else{
            return false ;
        }
    }
}