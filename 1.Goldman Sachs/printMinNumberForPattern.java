class Solution {
    static String printMinNumberForPattern(String S) {
        Stack<Integer> st = new Stack<>();
        int num = 1;
        String res = "";

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'D') {
                st.push(num);
                num++;
            } 
            else {
                st.push(num);
                num++;
                while (!st.isEmpty()) {
                    res += st.pop().toString();
                }
            }
        }
        st.push(num);
        while (!st.isEmpty()) {
            res += st.pop().toString();
        }

        return res;
    }
}