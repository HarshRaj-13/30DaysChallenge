class Solve {
    int[] findTwoElement(int a[], int n) {
        
        int hash[] = new int[n+1];

        for(int i = 0 ; i<n ; i++){
            hash[a[i]]++;
        }

        int repeating = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 2) 
                repeating = i;
            else if (hash[i] == 0) 
                missing = i;

            if (repeating != -1 && missing != -1)
                break;
        }
        
        int[] ans = {repeating, missing};
        return ans;
    }
}