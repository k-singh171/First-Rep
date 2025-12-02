import java.util.ArrayList;

public class gitLab {
    public static void main(String[] args) {
        int ageing = 20;
        System.out.println("Age: " + ageing);
        ArrayList<Integer> ageList = new ArrayList<>();
        ageList.add(50);
        ageList.add(24);
        ageList.add(45);
        ageList.add(34);
        System.out.println();
        NamingDesk obj = new NamingDesk();
        obj.name();
        System.out.println();
        School obj1 = new School();
        obj1.sclName();
        System.out.println();
        Robot obj2 = new Robot();
        obj2.walk();
        obj2.cam();
        System.out.println();
        int marking = 20;
        System.out.println(marking);
        String data = "SQL";
        System.out.println("Data-base: " + data);
    }
}

class NamingDesk{
    public String name(){
        return "Naming help desk available";
    }
}
class School{
    public void sclName(){
        System.out.println("Narayana Vidyalayam");
    }
}
class Robot{
    public void walk(){
        System.out.println("Robot instructed to walk..");
    }
    public void cam(){
        System.out.println("Robot instructed to record..");
    }
}