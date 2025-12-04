class Person
{
    String name;
    int age;
    
     Person(){
         name=null;
         age=0;
     }
     Person(String n,int a)
     {
         name=n;
         age=a;
     }
     void Display()
     {
         System.out.println("name is"+name);
         System.out.println("Age is"+age);
         System.out.println();
     }
}
class DemoPerson
        {
    public static void main()
    {
        Person P1=new Person();
        
        Person P2=new Person("Sakamoto",42);
        P1.Display();
        P2.Display();
    }
}
        
         
         
      