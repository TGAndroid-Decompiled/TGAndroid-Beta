package pg;
public final class u0 {
    public final double f41015a;
    public final double f41016b;
    public final double f41017c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f41015a = d;
        this.f41016b = d10;
        this.f41017c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f41017c - u0Var.f41017c, 2.0d) + Math.pow(this.f41016b - u0Var.f41016b, 2.0d) + Math.pow(this.f41015a - u0Var.f41015a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f41015a + u0Var.f41015a) * 0.5d, (this.f41016b + u0Var.f41016b) * 0.5d, (this.f41017c + u0Var.f41017c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f41015a != u0Var.f41015a || this.f41016b != u0Var.f41016b || this.f41017c != u0Var.f41017c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f41015a = d;
        this.f41016b = d10;
        this.f41017c = d11;
        this.d = true;
    }
}
