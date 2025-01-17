public class Nigerianflag {
    public static void main(String[] args){
        //Single
        System.out.println("Printing Nigerian flag with a single loop");
        for(int i=0; i<6; i++){
            System.out.println("GGGGWWWWGGGG");
        }
        //Nested loop
        System.out.println("Printing Nigerian flag with a nested loop");
        for(int i=0; i<4; i++){
            for(int j=0; j<12; j++){
               if(j<4 || j>=8){
                 System.out.print("G");

               }
               else{
                System.out.print("W");
               }
            }
            System.out.print("\n");
        }


    }
    
}
