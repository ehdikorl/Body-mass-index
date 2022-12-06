public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
       double weight = 70;
       double height = 1.93;
       double BMI = service.calculate(weight, height);
        System.out.println("Индекс массы тела: " + BMI);
    }
}