package homework;

public class Homework {
    public static void main(String[] args) {
        //Siin on TicketCount'i funktsiooni näide
        int TicketCost;
        TicketCost = (int) TicketCount(3);
        System.out.println(TicketCost);
        //Siin on for tsükli näide funktsioonis
        forTsükkel(3);
        //Siin on Ageopinion funktsiioni näide
        System.out.println(AgeOpinion(10));
        String age = AgeOpinion(63);
        System.out.println(age);
    }
    //Lihtsalt funktsioon mis loeb piletite summa
    public static double TicketCount(double m) {
        return 15*m;
    }

    // void on funktsioon selleks, et midagi teha
    public static void forTsükkel(int mitu) {
        for (int i = 0; i < mitu; i++) {
            System.out.println("Nothing");
        }
    }
    //If funktsioon
    public static String AgeOpinion(int age) {
        if (age < 50) {
            return "You are young";
        } else {
            return "You are old";
        }
    }
}