public class Pair5<K, D> extends Holder<D> {

    private K key;

    public Pair5(K key, D data) {
        super(data);
        this.key = key;
    }

    public void display() {
        System.out.println("K: " + key + " D: " + getData());
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
