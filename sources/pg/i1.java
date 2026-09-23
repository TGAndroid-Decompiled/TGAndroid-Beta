package pg;
public final class i1 {
    public double f40830a;
    public double f40831b;

    public i1(double d, double d10) {
        this.f40830a = d;
        this.f40831b = d10;
    }

    public final double a(double d, double d10) {
        return Math.sqrt(Math.pow(d10 - this.f40831b, 2.0d) + Math.pow(d - this.f40830a, 2.0d));
    }
}
