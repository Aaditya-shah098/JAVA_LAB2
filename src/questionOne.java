
class Fruit{
    String name;
    String taste;
    String size;
    Fruit(String n,String t,String s)
    {
        name=n;
        taste=t;
        size=s;
    }
    void Eat()
    {
        System.out.println("the name of fruit is"+ name);
        System.out.println("the taste  is"+taste);
    }
}
class Apple extends Fruit
{
    Apple(String n,String t,String s)
    {
        super(n,t,s);
    }
    void Eat()
    {
        System.out.println("This is"+name);
        System.out.println("It is"+taste+"in taste");
    }   
}

class Orange extends Fruit
{
   Orange (String n,String t,String s)
    {
        super(n,t,s);
    }
    void Eat()
    {
        System.out.println("This is"+name);
        System.out.println("It is"+taste+"in taste");
    }   
}
 class Delicious
{
    public static void main(String args[])
    {
        Apple a= new Apple("Apple","sweet","medium");
        a.Eat();
        
        Orange o =new Orange("Orange","sour","small");
        o.Eat();
    }
}
            