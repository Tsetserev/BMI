public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int h = 195;
        int m = 100;
        double bodyMassIndex = service.bmi(h, m);
        System.out.println("Ваш индекс≈ " + bodyMassIndex + " кг/м²");

    }


}
