package works.Lab6;

import java.util.Arrays;

public class Stack<T> {
    private T[] data;
    private int size = 0;

    public Stack() {
        this(16);
    }

    // Конструктор с заданной емкостью
    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
    }

    // Возвращает верхний элемент стека (без удаления)
    public T peek() {
        return data[(size - 1)];
    }

    // Извлекает и возвращает верхний элемент стека
    public T pop() {
        if (size == 0) {
            return null;
        }
        size--;
        T savedData = data[size];
        data[size] = null;
        return savedData;
    }

    // Добавляет новый элемент в стек
    public void push(T newElement) {
        if (size == data.length) {
            data = Arrays.copyOf(data, 2 * data.length);
        }
        data[size] = newElement;
        size++;
    }

    // Проверяет, пуст ли стек
    public boolean isEmpty() {
        return size == 0;
    }

    // Возвращает текущий размер стека
    public int getSize() {
        return size;
    }
}
