class Employee
{
    String Name;
    String Address;
    int salary;
    String JobTitle;
    
     Employee(String n,String a,int s,String JT)
     {
         Name=n;
         Address=a;
         salary=s;
         JobTitle=JT;
     }
     double CalculateBonus()
             {
                 return 0;
             }
     String PerformanceReport()
             {
                 return"the report of employee is";
             }
     void ManagingProjects(){
         System.out.println(Name+"is doing that work");
     }  
      void ShowInfo()
      {
          System.out.println("name is"+Name);
          System.out.println("address is"+Address);
          System.out.println("salary is"+salary);
          System.out.println("title ofjob is"+JobTitle);
      }
}
class Manager extends Employee {

    Manager(String n, String a, int  s) {
        super(n, a, s, "Manager");
    }

    double CalculateBonus() {
        return salary * 0.20; // 20% bonus
    }
    String PerformanceReport() {
        return "Manager Report: Strong leadership and project oversight.";
    }

    void ManagingProjects() {
        System.out.println(Name + " is managing multiple company projects.");
    }
}
class Developer extends Employee {

    Developer(String n, String a, int  s) {
        super(n, a, s, "Developer");
    }

    double CalculateBonus() {
        return salary * 0.25; 
    }
    String PerformanceReport() {
        return "Developer Report: Working on project day and night.";
    }

    void ManagingProjects() {
        System.out.println(Name + " is maintaing software system.");
    }
}
class Programmer extends Employee {

    Programmer(String n, String a, int  s) {
        super(n, a, s, "Programmer");
    }

    double CalculateBonus() {
        return salary * 0.10; 
    }
    String PerformanceReport() {
        return "Programmer Report: good at coding and debuging.";
    }

    void ManagingProjects() {
        System.out.println(Name + " is drinking coffee and coding all nights.");
    }
}
class EmployeeDemo {
    public static void main(String[] args) {

        Employee m = new Manager("Aaditya Shah", "Dhangadhi",150000);
        Employee d = new Developer("Bishal kc", "Lumbini", 20000);
        Employee p = new Programmer("Shubhakant chy", "Saptari", 1500);

        System.out.println("----- MANAGER -----");
        m.ShowInfo();
        System.out.println("Bonus: " + m.CalculateBonus());
        System.out.println(m.PerformanceReport());
       m.ManagingProjects();

        System.out.println("\n----- DEVELOPER -----");
        d.ShowInfo();
        System.out.println("Bonus: " + d.CalculateBonus());
        System.out.println(d.PerformanceReport());
        d.ManagingProjects();

        System.out.println("\n----- PROGRAMMER -----");
        p.ShowInfo();
        System.out.println("Bonus: " + p.CalculateBonus());
        System.out.println(p.PerformanceReport());
        p.ManagingProjects();
    }
}