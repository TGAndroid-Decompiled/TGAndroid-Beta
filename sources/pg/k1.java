package pg;
public final class k1 {
    public double f41160a;
    public double f41161b;

    public k1(double d, double d10) {
        this.f41160a = d;
        this.f41161b = d10;
    }

    public final double a(double d, double d10) {
        return Math.sqrt(Math.pow(d10 - this.f41161b, 2.0d) + Math.pow(d - this.f41160a, 2.0d));
    }
}
