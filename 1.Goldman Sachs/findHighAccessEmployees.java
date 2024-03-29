class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        Map<String, List<Integer>> when = new HashMap<>();
        for (List<String> v : access_times) {
            String a = v.get(0), b = v.get(1);
            when.computeIfAbsent(a, k -> new ArrayList<>()).add(Integer.parseInt(b));
        }
        List<String> ret = new ArrayList<>();

        for (Map.Entry<String, List<Integer>> entry : when.entrySet()) {
            entry.getValue().sort(null);

            int k = entry.getValue().size();
            boolean flag = false;

            for (int i = 0; i + 3 <= k; ++i)
                flag |= entry.getValue().get(i + 2) < entry.getValue().get(i) + 100;

   
            if (flag) ret.add(entry.getKey());
        }
        return ret;
    }
}




