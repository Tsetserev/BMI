public class BmiService {
    public double bmi(double h, double m){
        double growth = h * h;
        double weight = m / growth;
        double index = weight * 10000;
        return index;
    }

}
