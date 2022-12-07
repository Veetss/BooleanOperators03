//PROVA "CARTACEA"
//[A]: !(!(!(false ^ false) || (true && true))) = seconda affermazione vera -> V
//[B]: considering that x=3 and y=2: !((x * y) <= 6) && (x - y != 1) = no entrambe vere -> F

public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;

        System.out.println(!(!(!(false ^ false) || (true && true))));
        System.out.println(!((x * y) <= 6) && (x - y != 1));
    }
}