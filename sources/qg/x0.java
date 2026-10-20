package qg;
public final class x0 {
    public final double f44702a;
    public final double f44703b;
    public final double f44704c;
    public boolean d;

    public x0(double d, double d10, double d11) {
        this.f44702a = d;
        this.f44703b = d10;
        this.f44704c = d11;
    }

    public final float a(x0 x0Var) {
        return (float) Math.sqrt(Math.pow(this.f44704c - x0Var.f44704c, 2.0d) + Math.pow(this.f44703b - x0Var.f44703b, 2.0d) + Math.pow(this.f44702a - x0Var.f44702a, 2.0d));
    }

    public final x0 b(x0 x0Var) {
        return new x0((this.f44702a + x0Var.f44702a) * 0.5d, (this.f44703b + x0Var.f44703b) * 0.5d, (this.f44704c + x0Var.f44704c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f44702a != x0Var.f44702a || this.f44703b != x0Var.f44703b || this.f44704c != x0Var.f44704c) {
            return false;
        }
        return true;
    }

    public x0(double d, double d10, double d11, int i10) {
        this.f44702a = d;
        this.f44703b = d10;
        this.f44704c = d11;
        this.d = true;
    }
}
