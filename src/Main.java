public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        float weight = 100;
        int height = 185;
        System.out.println(bmi.calculate(height,weight));
    }

}
