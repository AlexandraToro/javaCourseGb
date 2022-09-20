package gb;
//  Написать реализацию очереди на основе массива;
//  Реализовать методы size(), empty(), offer(), poll(), peek()
//boolean offer(E obj): добавляет элемент obj в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false
//E peek(): возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null
//E poll(): возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null



public class Queue<T> {

    private T[] array;
    private int endIndex;
    private int startIndex;

    public Queue(int length) {
        this.startIndex = 0;
        this.endIndex = 0;
        this.array = (T[]) new Object[length];
    }

    public int size(){
        return (this.endIndex - this.startIndex);
    }
    public boolean empty(){
        return this.size() == 0;
    }
    public boolean offer (T value) {
        if (endIndex < this.array.length) {
            this.array[endIndex++] = value;
            return true;
        }
        else{
            return false;
        }
    }
    public T peek(){
        if(startIndex == endIndex){
            return null;
        }
        else{
            return this.array[startIndex];
        }
    }
    public T poll(){
        if(this.empty()){
            return null;
        }
        else {
            return this.array[startIndex++];
            }
    }

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>(2);
        System.out.println(queue.offer("1"));
        System.out.println(queue.offer("2gfdfg"));
        System.out.println(queue.offer("3v,klfjg"));
        System.out.println(queue.empty());
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.empty());
        System.out.println(queue.poll());
        System.out.println(queue.empty());
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}
