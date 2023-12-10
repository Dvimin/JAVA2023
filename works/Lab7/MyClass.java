package works.Lab7;

public class MyClass<T> {
    private T value;

    public MyClass (T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }
}
