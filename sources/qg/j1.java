package qg;
public final class j1 {
    public double f44965a;
    public double f44966b;

    public j1(double d, double d10) {
        this.f44965a = d;
        this.f44966b = d10;
    }

    public final double a(double d, double d10) {
        return Math.sqrt(Math.pow(d10 - this.f44966b, 2.0d) + Math.pow(d - this.f44965a, 2.0d));
    }
}
