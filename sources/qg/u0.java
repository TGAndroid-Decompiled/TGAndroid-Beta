package qg;
public final class u0 {
    public final double f44592a;
    public final double f44593b;
    public final double f44594c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f44592a = d;
        this.f44593b = d10;
        this.f44594c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f44594c - u0Var.f44594c, 2.0d) + Math.pow(this.f44593b - u0Var.f44593b, 2.0d) + Math.pow(this.f44592a - u0Var.f44592a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f44592a + u0Var.f44592a) * 0.5d, (this.f44593b + u0Var.f44593b) * 0.5d, (this.f44594c + u0Var.f44594c) * 0.5d);
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
        if (this.f44592a != u0Var.f44592a || this.f44593b != u0Var.f44593b || this.f44594c != u0Var.f44594c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f44592a = d;
        this.f44593b = d10;
        this.f44594c = d11;
        this.d = true;
    }
}
