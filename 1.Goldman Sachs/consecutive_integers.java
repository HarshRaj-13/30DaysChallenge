// SC: O(1)
class DataStream {
    final int value;
    final int k;
    int cosecCountOfValue;

    // TC: O(1)
    // SC: O(1)
    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
        this.cosecCountOfValue = 0;
    }
    
    // TC: O(1)
    // SC: O(1)
    public boolean consec(int num) {
        if(num==value){
            if(cosecCountOfValue<k){
                cosecCountOfValue++;
            }
            return cosecCountOfValue==k;
        } 
        cosecCountOfValue = 0;
        return false;
    }
}