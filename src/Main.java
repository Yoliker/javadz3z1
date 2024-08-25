public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
//        int miles = service.calculate(price); // должно получиться 500
//        System.out.println(miles);

        System.out.println("10_000");
        System.out.println(service.calculate(10_000));

        System.out.println();
        System.out.println("21");
        System.out.println(service.calculate(21));

        System.out.println();
        System.out.println("20");
        System.out.println(service.calculate(20));

        System.out.println();
        System.out.println("19");
        System.out.println(service.calculate(19));

        System.out.println();
        System.out.println("1");
        System.out.println(service.calculate(1));

        System.out.println();
        System.out.println("0");
        System.out.println(service.calculate(0));

        System.out.println();
        System.out.println("-1");
        System.out.println(service.calculate(-1));

    }
}