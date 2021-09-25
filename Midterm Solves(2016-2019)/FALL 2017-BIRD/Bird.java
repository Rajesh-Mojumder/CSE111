public class Bird {
    //your code here
  String size="";
  String color="";
  public Bird () {
  
  }
  public Bird (String a) {
  size=a;
  }
  public Bird (String a,String b) {
  size=a;
  color=b;
  }
  public void fly () {
    if(size=="" && color=="") {
    System.out.println("Bird*is*flying.");
    } else if ((size!="" && color=="")) {
     System.out.println(size+"*"+"bird"+"*is*flying.");
    }
    else {
  System.out.println(size+"*"+color+"*"+"bird"+"*is*flying.");
  }
}
}
