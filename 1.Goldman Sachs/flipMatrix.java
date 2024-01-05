class Solution {
    public int m;
    public int n;
    public HashSet<String> mat;

    public Solution(int m, int n) {
        mat = new HashSet<>();
        this.m = m;
        this.n = n;
    }
    
    public int[] flip() {
        int r = (int) (Math.random() * m);
        int c = (int) (Math.random() * n);
        
        while(mat.contains(r + " " + c)){
            r = (int) (Math.random() * m);
            c = (int) (Math.random() * n);
        }
            
        int output[] = {r, c};
        mat.add(r + " " + c);
                               
        return output;
    }
    
    public void reset() {
        mat.clear();
    }
}
