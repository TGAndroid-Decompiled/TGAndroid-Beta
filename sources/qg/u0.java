package qg;
public final class u0 {
    public final double f44593a;
    public final double f44594b;
    public final double f44595c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f44593a = d;
        this.f44594b = d10;
        this.f44595c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f44595c - u0Var.f44595c, 2.0d) + Math.pow(this.f44594b - u0Var.f44594b, 2.0d) + Math.pow(this.f44593a - u0Var.f44593a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f44593a + u0Var.f44593a) * 0.5d, (this.f44594b + u0Var.f44594b) * 0.5d, (this.f44595c + u0Var.f44595c) * 0.5d);
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
        if (this.f44593a != u0Var.f44593a || this.f44594b != u0Var.f44594b || this.f44595c != u0Var.f44595c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f44593a = d;
        this.f44594b = d10;
        this.f44595c = d11;
        this.d = true;
    }
}
