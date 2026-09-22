package pg;
public final class u0 {
    public final double f41011a;
    public final double f41012b;
    public final double f41013c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f41011a = d;
        this.f41012b = d10;
        this.f41013c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f41013c - u0Var.f41013c, 2.0d) + Math.pow(this.f41012b - u0Var.f41012b, 2.0d) + Math.pow(this.f41011a - u0Var.f41011a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f41011a + u0Var.f41011a) * 0.5d, (this.f41012b + u0Var.f41012b) * 0.5d, (this.f41013c + u0Var.f41013c) * 0.5d);
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
        if (this.f41011a != u0Var.f41011a || this.f41012b != u0Var.f41012b || this.f41013c != u0Var.f41013c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f41011a = d;
        this.f41012b = d10;
        this.f41013c = d11;
        this.d = true;
    }
}
