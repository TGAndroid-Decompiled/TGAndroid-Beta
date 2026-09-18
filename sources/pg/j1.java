package pg;
public final class j1 {
    public double f41140a;
    public double f41141b;

    public j1(double d, double d10) {
        this.f41140a = d;
        this.f41141b = d10;
    }

    public final double a(double d, double d10) {
        return Math.sqrt(Math.pow(d10 - this.f41141b, 2.0d) + Math.pow(d - this.f41140a, 2.0d));
    }
}
