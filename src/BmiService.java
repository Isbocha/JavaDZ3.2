public class BmiService {
    public int calculate(double meters, double kilogram) {
        double result1 = kilogram / (meters * meters);
        int result2 = (int) result1;
        return result2;
    }
}
