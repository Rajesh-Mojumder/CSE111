public class Student{
    private String name = "Default";
    //your code here 
    public static int number;
    
    public  Student () {
         number++;
    
    } 
    public void setName (String n) {
    name=n;
    }
     public String getName () {
    return name;
    }
     
     public  Student (String n) {
     name =n;
     number++;
     }
    
     
}
