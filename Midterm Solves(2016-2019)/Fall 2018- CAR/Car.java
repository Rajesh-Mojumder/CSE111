public class Car {
     private String make = "";
     private String model = "";
     //your code here 
     public Car () {
     }
     
     public Car (String a) {
          model =a;
     }
     
     public Car (String a, String b) {
          make =a;
          model=b;
     }
     public void start() {
          if (model== "" && make== "") {
               System.out.println("Car is starting");
          } else { 
               if (model!= "" && make== ""){
                    System.out.println("Car make: "+model+ " is starting" );
               } else {
                    
                    System.out.println("Car make: " +make+" model : "+model +"is starting");
               }
               
          }
     }
}