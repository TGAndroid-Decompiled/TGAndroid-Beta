package pg;
public final class j1 {
    public double f41181a;
    public double f41182b;

    public j1(double d, double d10) {
        this.f41181a = d;
        this.f41182b = d10;
    }

    public final double a(double d, double d10) {
        return Math.sqrt(Math.pow(d10 - this.f41182b, 2.0d) + Math.pow(d - this.f41181a, 2.0d));
    }
}
