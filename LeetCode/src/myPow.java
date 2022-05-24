// Q50
public class myPow {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if(n<0){
            x = 1.0 / x;
        }
        double result = myPow(x, Math.abs(n / 2));
        result = result * result;
        if (n % 2 != 0) {
            result = result * x;
        }
        return result;
    }
}
