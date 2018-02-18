package stack;

public class Stack {

    private Number [] arr;
    private int size;
    private int defaultSize;
    private int current;

    public Stack(){
        this.current = 0;
        this.size = 0;
        this.defaultSize = 10000000;
        this.arr = new Number[this.defaultSize];
    }

    public Stack(int size){
        this.current = 0;
        this.size = size;
        arr = new Number[size];
    }

    public void push(Number data) {
        if (this.size == 0) {
            if (this.current < this.defaultSize) {
                this.arr[this.current++] = data;
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        if(this.current<size){
            this.arr[this.current++] = data;
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public void pop(){
        if(current < 0){
            throw new IndexOutOfBoundsException();
        }
        this.arr[--this.current] = null;
    }

    public boolean isEmpty(){
        return this.current == 0;
    }

    public Number peek(){
        return this.arr[this.current-1];
    }

}
