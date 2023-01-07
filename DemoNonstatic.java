public class DemoNonstatic {
    public void dispfunc() {
             System.out.println("Display using non-static method");
    }
    public static void main(String[] args) {
             DemoNonstatic obj=new DemoNonstatic();
             obj.dispfunc(); //directly using the dispfunc() will cause an error here
             StringBuilder sbr = new StringBuilder();
            sbr.append("Greetings"); //adds 9 characters to the array
            System.out.println(sbr);
    }
    }