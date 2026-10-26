package rg;
public final class u0 {
    public final double f47571a;
    public final double f47572b;
    public final double f47573c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f47571a = d;
        this.f47572b = d10;
        this.f47573c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f47573c - u0Var.f47573c, 2.0d) + Math.pow(this.f47572b - u0Var.f47572b, 2.0d) + Math.pow(this.f47571a - u0Var.f47571a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f47571a + u0Var.f47571a) * 0.5d, (this.f47572b + u0Var.f47572b) * 0.5d, (this.f47573c + u0Var.f47573c) * 0.5d);
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
        if (this.f47571a != u0Var.f47571a || this.f47572b != u0Var.f47572b || this.f47573c != u0Var.f47573c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f47571a = d;
        this.f47572b = d10;
        this.f47573c = d11;
        this.d = true;
    }
}
