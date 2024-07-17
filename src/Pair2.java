public class Pair2 extends Holder<String> {
    private String key;

    public Pair2(String data, String key) {
        super(data);
        this.key = key;
    }

    public Pair2() {
        this.key = null;
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
