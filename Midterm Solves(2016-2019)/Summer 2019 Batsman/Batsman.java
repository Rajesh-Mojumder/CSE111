public class Batsman {
     String name="New Batsman";
     int balls;
     int runs;
     double sr;
     public Batsman (int a , int b) {
          runs =a;
          balls=b;
      }
     
     public Batsman (String s,int a , int b) {
          name =s;
          runs =a;
          balls=b;
      
     }
     public void setName(String a) {
          name =a;
     }
     public double battingStrikeRate() { // AS the output is on double so the return type is on double. Here You have to cast the int to double to get the decimal value
          sr=(double)runs/balls*100;    
         return sr;
     }
     public void  printCareerStatistics () {
          System.out.println("Name: "+name);
          System.out.println("Runs Scored :"+runs+" Ball Faced :"+balls);
     }
     
}