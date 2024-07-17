public class Pair4<T> extends Holder<String> {
    private T key;

    public Pair4(T key, String data) {
        super(data);
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public void display() {
        System.out.println("K: " + key + " D: " + getData());
    }
}
