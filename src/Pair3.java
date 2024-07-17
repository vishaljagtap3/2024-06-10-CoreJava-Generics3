public class Pair3<T> extends Holder<T>{
    private String key;

    public Pair3(String key, T data) {
        super(data);
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void display() {
        System.out.println("K: " + key + " D: " + getData());
    }
}
