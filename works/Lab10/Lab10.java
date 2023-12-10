package works.Lab10;

public class Lab10 {
    public static void print(TripleContainer<?> instance) {
        try {
            System.out.println("Min: " + instance.min());
            System.out.println("Max: " + instance.max());
            System.out.println("Mean: " + instance.mean());
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        TripleContainer<Integer> inst1 = new TripleContainer<>(2, 2, 5);
        inst1.setSecond(12);
        print(inst1);

        TripleContainer<String> inst2 = new TripleContainer<>("a", "b", "C");
        inst2.setFirst("F");
        print(inst2);
    }
}