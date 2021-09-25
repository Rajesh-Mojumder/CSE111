public class Avenger {
  private String name = " ";
  private String power = " ";
  //your code here 
  public Avenger () {
    if(name==" " && power==" ") {
      System.out.println("Super hero name and power need to be set.");
    }
    
  }
  public void setName(String a) {
    name=a;
    if(power==" "){
      System.out.println("Power for Black Widow needs to be set.");
    }
  }
  public void setPower (String a) {
    power =a;    
  }
  
  public  Avenger (String a) {
    name =a;
  }
  public  Avenger (String a, String b) {
    name =a;
    power=b;
    System.out.println(name +" is ready to attack. ");
  }
  public void attack() {
    System.out.println(name +"*is*" +power+"ing");
  }
  
}