public class Holder<T> {
    private T data;

    public Holder(T data) {
        this.data = data;
    }

    public Holder() {
        this.data = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
