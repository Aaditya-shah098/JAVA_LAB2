class Grandpa
{
    int gamt;
    Grandpa(int gamt)
    {
        this.gamt=gamt;
    }
    void showGranpaAmt(){
          System.out.println("Grandpa Amount="+gamt);
    }
}
class Parent extends Grandpa
{
    int pamt;
    Parent(int gamt,int pamt)
    {
        super(gamt);
        this.pamt=pamt;
    }
    void showParentAmt()
    {
        System.out.println("Parents amt is="+pamt);
    }      
}
class Child extends Parent
{
    int camt;
    Child(int gamt,int pamt,int camt)
    {
        super(gamt,pamt);
    
        this.camt=camt;
    }
    void ShowchildAmt()
    {
        System.out.println("Child amount is="+camt);
    }
}

 class MultiDemo
{
    public static void main(String args[])
    {
        Child c=new Child(5000,3000,2000);
        
        c.showGranpaAmt();
        c.showParentAmt();
        c.ShowchildAmt();
    }
}

    
