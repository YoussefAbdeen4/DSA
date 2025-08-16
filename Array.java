public  class Array<T>{
    private T [] arr;
    private int size;
    public Array(){
        arr = (T[]) new Object[100];
        size = 0;
    }
    public Array(int capacity){
        arr = (T[]) new Object[capacity];
        size = 0;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    public boolean isFull(){
        return this.size == this.arr.length;
    }
    public int getSize(){
        return this.size;
    }
    public void add(T item){
        validSize();
        this.arr[this.size++]=item;
    }
    public void insert(int index,T item){
        validSize();
        validIndex(index);
        for (int i = arr.length-1; i >index ; i--) {
            arr[i]=arr[i-1];
        }
        arr[index]=item;
        size++;
    }

    public void set(int index,T item){
        validIndex(index);
        if (arr[index]==null)size++;
        this.arr[index]=item;
    }
    public T get(int index){
        validIndex(index);
        return arr[index];
    }
    public void remove(int index){
        validIndex(index);
        arr[index]=null;
        size--;
    }
    private void validIndex(int index){
        if (index < 0 || index>= this.arr.length ){
            throw new ArrayIndexOutOfBoundsException("This index is out of bounds..!");
        }
    }
    private void validSize(){
        if (isFull()) {
            throw new RuntimeException("Array is full..!");
        }
    }
}
 class Main {
    public static void main(String[] args) {
        /******************* Declaration ***************/
        /* 1 D array */
        int [] a=new int[2];
        /* 2 D array */
        int [][] a2=new int[2][2];
        /* Jagged Array */
        int [][] jagged = new int[3][];
        jagged[0]=new int[1];
        jagged[1]=new int[3];
        jagged[2]=new int[2];
        /**** Implemented Array ****/
        Array <Integer> arr=new Array<>();
        Array <Integer> array=new Array<>(10);
    }
}