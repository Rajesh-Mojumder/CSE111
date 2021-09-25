public class Student{
  public String name;
  public int ID;
  public String dept = "undecided";
  public Student(String name, int ID, String dept){
    this.name = name;
    this.ID = ID;
    this.dept = dept;
  }
  public Student(String name){
    this.name = name;
  }
  public void setID(int a){
    ID = a;
  }
  public void printDetails(){
    System.out.println("Name: "+name+", id: "+ID+", program: "+dept);
  }
  public void changeProgram(String a){ //  HERE CHANGE PROGRAM is responsible for printing the "complete 124 credits" lines
    dept = a;
    if(dept=="CS"){
      System.out.println(name+" has to complete 124 credits");
    }else{
      System.out.println(name+" has to complete 136 credits");
    }
  }
}