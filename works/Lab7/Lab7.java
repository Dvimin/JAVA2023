package works.Lab7;

public class Lab7<T> {
    private T value;

    public Lab7(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static <T> void swapValues(Lab7<MyClass<T>> obj1, Lab7<MyClass<T>> obj2) {
        MyClass<T> value1 = obj1.getValue();
        MyClass<T> value2 = obj2.getValue();

        MyClass<T> temp = new MyClass<>(value1.get());
        value1.set(value2.get());
        value2.set(temp.get());
    }

    public static void main(String[] args) {
        Lab7<MyClass<Integer>> obj1 = new Lab7<>(new MyClass<>(5));
        Lab7<MyClass<Integer>> obj2 = new Lab7<>(new MyClass<>(10));

        System.out.println("Значения до обмена:");
        System.out.println("obj1: " + obj1.getValue().get());
        System.out.println("obj2: " + obj2.getValue().get());

        swapValues(obj1, obj2);

        System.out.println("\nЗначения после обмена:");
        System.out.println("obj1: " + obj1.getValue().get());
        System.out.println("obj2: " + obj2.getValue().get());
    }
}
