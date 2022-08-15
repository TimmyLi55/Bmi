public class BmiService {
    public float calculate(int height, float weight) {
        float heightFromMeter = (float) height / 100;
        float bmi = weight / (heightFromMeter * heightFromMeter);
        return bmi;

    }
}
