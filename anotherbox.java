package Jan7;

class anotherbox<T> {
    private T t;
public void set(T t) {
		 this.t = t;
}
public T get() {
		return t;
}

public <U extends Number> void inspect(U u){
		 System.out.println("T: " + t.getClass().getName());
		 System.out.println("U: " + u.getClass().getName());
}
public static void main(String[] args) {
		 anotherbox<Integer> integerBox = new anotherbox<Integer>();
		integerBox.set(new Integer(15));
        integerBox.inspect(10.0);
		 //integerBox.inspect("some text"); // error: is presented since this would still be
//returning a String
}
}
    

