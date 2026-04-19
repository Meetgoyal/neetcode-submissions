class MyHashMap {
    int[] hp;
    public MyHashMap() {
        this.hp = new int[1000001];
        Arrays.fill(this.hp,-1);
    }
    
    public void put(int key, int value) {
        hp[key] = value;
    }
    
    public int get(int key) {
        return hp[key];
    }
    
    public void remove(int key) {
        hp[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */