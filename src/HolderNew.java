public class HolderNew<T extends Number> {
    private T data;

    public HolderNew(T data) {
        this.data = data;
    }

    public HolderNew() {
        this.data = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
