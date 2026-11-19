class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        int m = strs.length;
        HashMap<String,List<String>> hmap = new HashMap<>();
        for(int i=0;i<m;i++){
            String s = strs[i];
            int a[]=new int[26];
            int n=s.length();
            for(int j=0;j<n;j++){
                int x=s.charAt(j)-'a';
                a[x]++;
            }
            String key = Arrays.toString(a);
            if(hmap.containsKey(key)){
                hmap.get(key).add(s);
            }else{
                List<String> temp=new ArrayList<>();
                temp.add(s);
                hmap.put(key,temp);
            }
        }

        for(Map.Entry<String,List<String>> e:hmap.entrySet()){
            res.add(e.getValue());
        }

        return res;
    }
}
