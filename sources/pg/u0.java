package pg;
public final class u0 {
    public final double f41042a;
    public final double f41043b;
    public final double f41044c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f41042a = d;
        this.f41043b = d10;
        this.f41044c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f41044c - u0Var.f41044c, 2.0d) + Math.pow(this.f41043b - u0Var.f41043b, 2.0d) + Math.pow(this.f41042a - u0Var.f41042a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f41042a + u0Var.f41042a) * 0.5d, (this.f41043b + u0Var.f41043b) * 0.5d, (this.f41044c + u0Var.f41044c) * 0.5d);
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
        if (this.f41042a != u0Var.f41042a || this.f41043b != u0Var.f41043b || this.f41044c != u0Var.f41044c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f41042a = d;
        this.f41043b = d10;
        this.f41044c = d11;
        this.d = true;
    }
}
