public class Dog {
    private String color = "Black";
    //your code here 
    public Dog() {
    
    }
    public Dog (String a) {
    color =a;
    }
    public void bark () {
    System.out.println(color+ " dog is barking");
    }
    public void changeColor (String a) {
    color =a;
    }
}

