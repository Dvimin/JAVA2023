package works.Lab6;

public class Lab6 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(8);

        System.out.println("Стек пуст: " + stack.isEmpty());

        for (int index = 0; index < 5; index += 1) {
            stack.push(index);
        }

        System.out.println("В стеке " + stack.getSize() + " элементов");
        System.out.println("Последний элемент: " + stack.peek());

        stack.pop();

        System.out.println("В стеке " + stack.getSize() + " элементов");
        System.out.println("Последний элемент: " + stack.peek());
    }
}