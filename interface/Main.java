public class Main{
  public static void main(String[] args){
    Employees oliver = new Employees("Oliver Mensah", 24);
    oliver.pay();
    System.out.println(oliver.salary);
    System.out.println(oliver.retired());
  }
  
}