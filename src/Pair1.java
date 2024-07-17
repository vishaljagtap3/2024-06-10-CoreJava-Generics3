/**
 * Holder with type parameter Object will be inherited
 */

public class Pair1 extends Holder{
    private String key;

    public Pair1(String key, Object data) {
        super(data);
        this.key = key;
    }

    public Pair1() {
        super();
        this.key = null;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void display() {
        System.out.println("K: " + key + " data: " + getData());
    }
}
