import java.util.ArrayList;

public class gitPrac {
    public static void main(String[] args) {
        int value = 10;
        String name = "Ashutosh";
        System.out.println("Name: " + name);
        ArrayList<String> staffName = new ArrayList<>();
        staffName.add("Ashu");
        staffName.add("Pratham");
        staffName.add("Abhinash");
        System.out.println();
        Phone obj = new Phone();
        obj.ring();
    }
}
class Phone{
    public void ring(){
        System.out.println("Ringing...");
    }
}