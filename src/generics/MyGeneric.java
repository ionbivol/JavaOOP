package generics;

public class MyGeneric<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public MyGeneric(T item) {
        this.item = item;
    }

    public static <E> void printElements(E[]array){
        for(E element:array){
            System.out.println(element);
        }
    }



    public static void main(String[] args) {

        MyGeneric<String> obj1 = new MyGeneric<>("The winter is coming");
        obj1.getItem();
        System.out.println(obj1.getItem());

        MyGeneric<Integer> obj2 = new MyGeneric<>(10);
        System.out.println(obj2.getItem());


        Integer[] numbers = {1, 2, 3, 4, 5};
        Character [] characters = {'a', 'b', 'c'};

        printElements(numbers);
        printElements(characters);


    }
}
