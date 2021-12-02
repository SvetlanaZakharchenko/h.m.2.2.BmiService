public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double index = service.calculate(43, 1.56 );

        System.out.println("Индекс массы тела: " + index);

    }

}
