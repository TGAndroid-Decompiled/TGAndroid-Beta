package yf;

public final class t0 {

    public final double f50086a;

    public final double f50087b;

    public final double f50088c;
    public boolean d;

    public t0(double d, double d10, double d11) {
        this.f50086a = d;
        this.f50087b = d10;
        this.f50088c = d11;
    }

    public final float a(t0 t0Var) {
        return (float) Math.sqrt(Math.pow(this.f50088c - t0Var.f50088c, 2.0d) + Math.pow(this.f50087b - t0Var.f50087b, 2.0d) + Math.pow(this.f50086a - t0Var.f50086a, 2.0d));
    }

    public final t0 b(t0 t0Var) {
        return new t0((this.f50086a + t0Var.f50086a) * 0.5d, (this.f50087b + t0Var.f50087b) * 0.5d, (this.f50088c + t0Var.f50088c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f50086a == t0Var.f50086a && this.f50087b == t0Var.f50087b && this.f50088c == t0Var.f50088c;
    }

    public t0(double d, double d10, double d11, int i10) {
        this.f50086a = d;
        this.f50087b = d10;
        this.f50088c = d11;
        this.d = true;
    }
}
