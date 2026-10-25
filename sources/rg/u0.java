package rg;
public final class u0 {
    public final double f47568a;
    public final double f47569b;
    public final double f47570c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f47568a = d;
        this.f47569b = d10;
        this.f47570c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f47570c - u0Var.f47570c, 2.0d) + Math.pow(this.f47569b - u0Var.f47569b, 2.0d) + Math.pow(this.f47568a - u0Var.f47568a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f47568a + u0Var.f47568a) * 0.5d, (this.f47569b + u0Var.f47569b) * 0.5d, (this.f47570c + u0Var.f47570c) * 0.5d);
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
        if (this.f47568a != u0Var.f47568a || this.f47569b != u0Var.f47569b || this.f47570c != u0Var.f47570c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f47568a = d;
        this.f47569b = d10;
        this.f47570c = d11;
        this.d = true;
    }
}
