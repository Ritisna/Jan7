package Jan7;
import java.util.ArrayList;
class ArrList
{
    public static void main(String args[]){
        ArrayList<String> a=new ArrayList<String>();
        a.add("Ritisna");
        a.add("Priyadarshini");
        a.add(0, "input using index");
        a.add(2, "skipping indexes");
        System.out.println(a);
    }
}

