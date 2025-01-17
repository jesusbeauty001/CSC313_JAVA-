public class USAflag{
    public static void main(String[] args) {
        for(int i=0; i<12; i++){
            if(i<3){
                System.out.println("****=======");
            }
            else{
                 System.out.println("===========");
            }
        }
        //Nested loop
        System.out.println("Printing the USA flag in Nested loop");
        for(int i=0; i<6; i++){
            for(int j=0; j<11; j++){
                if(i<3 && j<4){
                    System.out.print("*");
                }
                else{
                    System.out.print("=");
                }
            }
            System.out.println("\n");
        }
    }
}