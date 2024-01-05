class Solution {
    public List<String> letterCombinations(String digits) {

        String map[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();

        if(digits.length() == 0)
            return res;

        solve(0 , digits , new StringBuilder() , map , res);
        
        return res;
    }
    public void solve(int length , String digits , StringBuilder temp , String map[] , List<String> res){
        if(length == digits.length()){
            res.add(temp.toString());
            return;
        }

        char ch = digits.charAt(length);
        String str = map[ch-'0'];
        for(char c : str.toCharArray()){
            temp.append(c);
            solve(length+1 , digits , temp , map , res);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}