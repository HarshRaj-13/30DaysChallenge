import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans = new ArrayList<>();
        func(1,n,k,new ArrayList<>() , ans);
        return ans;
    }
    public void func(int idx , int n , int k , List<Integer> ds , List<List<Integer>>ans){
        //BC
        if(k==0){
            if(n==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        for(int i = idx ; i<=9 ; i++){
            ds.add(i);
            func(i+1,n-i,k-1,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
}