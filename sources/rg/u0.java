package rg;
public final class u0 {
    public final double f47606a;
    public final double f47607b;
    public final double f47608c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f47606a = d;
        this.f47607b = d10;
        this.f47608c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f47608c - u0Var.f47608c, 2.0d) + Math.pow(this.f47607b - u0Var.f47607b, 2.0d) + Math.pow(this.f47606a - u0Var.f47606a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f47606a + u0Var.f47606a) * 0.5d, (this.f47607b + u0Var.f47607b) * 0.5d, (this.f47608c + u0Var.f47608c) * 0.5d);
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
        if (this.f47606a != u0Var.f47606a || this.f47607b != u0Var.f47607b || this.f47608c != u0Var.f47608c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f47606a = d;
        this.f47607b = d10;
        this.f47608c = d11;
        this.d = true;
    }
}
