public class Player{
    private String name = "Default";
    private int number = 0;  
    private String team = "Default"; 
    //your code here
    public Player() {
    }
    public void setName(String a) {
    name =a;
    }
    public void setNumber(int a) {
    number=a;
    }
    public void setTeam(String a) {
    team=a;
    }
    public void detail() {
    System.out.println(name+"*is*no."+number+"*for*"+team);
    }
    public Player(String a) {
      name=a;
    }
     public Player(String a,int b) {
      name=a;
      number=b;
    }
     public Player(String a,int b,String c) {
      name=a;
      number=b;
      team=c;
    }
    
}