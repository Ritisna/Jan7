public class array1 {
  
        public static void main(String[] args) {
        String[][] salName = { { "Mr. ", "Mrs. ", "Ms. " }, { "Alan", "Janice" } };
        // We have elements for only two rows out of three
        //System.out.println("The first combined value is: " + salName[0][0] + salName[1][0]);
        // Prints first name combination
        for(int i=0;i<salName.length;i++){
            for(int j=0;j<salName[i].length;j++){
                System.out.println(salName[i][j].charAt(0));
            }
        }
        //System.out.println("The second combined value is: " + salName[0][2] + salName[1][1]);
        }
        }
    

