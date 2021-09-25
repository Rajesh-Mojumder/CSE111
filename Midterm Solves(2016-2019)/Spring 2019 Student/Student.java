public class Student{
  public int appID;
  public int ID;
  private String name;
  public Student(int a, int b, String c){
    appID = a;
    ID = b;
    name = c;
  }
  public boolean check(Student d){ // c is a student type object.As the first output is True or false and there is a receiver so the return type will be a boolean
    if(appID==d.appID && name==d.name){ // comparing with old ID with receiving ID
      return true; // boolean datatype
    }else{
      return false;
    }
  }
  public void identify(){ 
    System.out.println("ApplicantID: "+appID+" StudentID: "+ID+" Name: "+name);
  }
  public void setName(String e){
    name = e;
  }
  public void match(Student f){ // match or not
    if(appID==f.appID && name==f.name){
      System.out.println(ID+" is same person as "+f.ID);
    }else{
      System.out.println(ID+" is different person from "+f.ID);
    }
  }
}