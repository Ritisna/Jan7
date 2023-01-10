package java11.fundamentals;
public class DemoArrayMulti {
 public static void main(String[] args) {
 String[][] salName = { { "Mr. ", "Mrs. ", "Ms. " }, { "Alan", "Janice" } };
 // We have elements for only two rows out of three
	 	 System.out.println("The	first	combined	value	is:	"	+	salName[0][0]	+	salName[1][0]);
	 	 //	Prints	first	name	combination
	 	 System.out.println("The	second	combined	value	is:	"	+	salName[0][2]	+	salName[1][1]);
 }
}