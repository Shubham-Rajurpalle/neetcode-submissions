class KthLargest {

    PriorityQueue<Integer> p;
    int []arr;
    int x;


    public KthLargest(int k, int[] nums) {
        this.x = k;
        p = new PriorityQueue<>();
        for(int i : nums){
            add(i);
        }
    }
    
    public int add(int val) {
        if(p.size()<x){
            p.add(val);
        }else if(p.peek()<val){
            p.poll();
            p.add(val);
        }
        return p.peek();
    }
}
