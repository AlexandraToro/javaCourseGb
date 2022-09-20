package gb;
// Взять за основу реализацию стека, написанную в конце семенара.
// Добавить проверку граничных условий и выводить сообщения об ошибках,
// если мы пытаемся извлечь элемент из пустого стека,
// добавить элемент в полностью заполненный стек и тд

public class Stack<T> {

    private T[] array;
    private int index;

    public Stack(int length) {
        this.index = 0;
        this.array = (T[]) new Object[length];
    }

    public int size(){
        return this.index;
    }
    public boolean empty(){
        return this.size() == 0;
    }
    public void push(T value) {
        if (index < this.array.length) {
            this.array[index++] = value;
        }
        else{
            System.out.println("Ошибка. Стэк переполнен");
        }
    }
    public T peek(){
        if(this.empty()){
            return (T) "Ошибка. Стэк пуст";
        }
        else{
            return this.array[index-1];
        }
    }
    public T pop(){
        if(this.empty()){
            return (T) "Ошибка. Стэк пуст";
        }
        else {
            return this.array[--index];}
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack(2);
        stack.push("dvfsdf");
        stack.push("fgfdfg");
        stack.push("v,klfjg");
        stack.push("vfkjhgkf");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
