public class Funktsioonid {
    public static void main(String[] args) {
        //sout --> genereerin
        System.out.println(taksosõit(h: 3.5));

        double soiduMaksumus = taksosõit(h:0.5);
        System.out.println(soiduMaksumus);

        prindiForTsukkel(5);

    }
    public static double taksosõit(double h){
        return 3+0.8*h; //funktsioon selleks, et midagi saada
    }
    //void on funktsioon ,et midagi teha
    public static void prindiForTsukkel(int kordadeArv){
        for (int i = 0; i < kordadeArv; i++) {
            System.out.println(i*10);
        }
    }
    public static String temperatuuriHinnang(float temperatuur){
        if(temperatuur < 0) {
            return "on jääs"
        }else{
            return "mitte jääs"
        }

    }
}

