public class Main {

    public static void main(String[] args) {
        Cone one = new Cone();
        System.out.println("================Method1================");
        for (int i=1;i<=10;i++) {
            System.out.print(one.getConeNum(i));
            System.out.print(",");
        }
        System.out.println("");
        System.out.println("================Method2================");
        for (int i=1;i<=10;i++) {
            System.out.print(one.getConeNum1(i));
            System.out.print(",");
        }
    }
}
