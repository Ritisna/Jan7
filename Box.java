package Jan7;

class Box1<T>{
    private T t;
public void set(T t) { this.t = t; }
public T get() { return t; }
}

public class Box{
    public static void main(String[] args) {
        Box1<String> ob=new Box1<> ();
        ob.set("Riti");
        System.out.println(ob.get());
        Box1<Integer> ob1=new Box1<>();
        ob1.set(46);
        System.out.println(ob1.get());
    }
}

