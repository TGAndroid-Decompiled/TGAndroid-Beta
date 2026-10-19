package qg;
public final class x0 {
    public final double f44692a;
    public final double f44693b;
    public final double f44694c;
    public boolean d;

    public x0(double d, double d10, double d11) {
        this.f44692a = d;
        this.f44693b = d10;
        this.f44694c = d11;
    }

    public final float a(x0 x0Var) {
        return (float) Math.sqrt(Math.pow(this.f44694c - x0Var.f44694c, 2.0d) + Math.pow(this.f44693b - x0Var.f44693b, 2.0d) + Math.pow(this.f44692a - x0Var.f44692a, 2.0d));
    }

    public final x0 b(x0 x0Var) {
        return new x0((this.f44692a + x0Var.f44692a) * 0.5d, (this.f44693b + x0Var.f44693b) * 0.5d, (this.f44694c + x0Var.f44694c) * 0.5d);
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
        if (this.f44692a != x0Var.f44692a || this.f44693b != x0Var.f44693b || this.f44694c != x0Var.f44694c) {
            return false;
        }
        return true;
    }

    public x0(double d, double d10, double d11, int i10) {
        this.f44692a = d;
        this.f44693b = d10;
        this.f44694c = d11;
        this.d = true;
    }
}
