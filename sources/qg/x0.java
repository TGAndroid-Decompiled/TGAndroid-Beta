package qg;
public final class x0 {
    public final double f44694a;
    public final double f44695b;
    public final double f44696c;
    public boolean d;

    public x0(double d, double d10, double d11) {
        this.f44694a = d;
        this.f44695b = d10;
        this.f44696c = d11;
    }

    public final float a(x0 x0Var) {
        return (float) Math.sqrt(Math.pow(this.f44696c - x0Var.f44696c, 2.0d) + Math.pow(this.f44695b - x0Var.f44695b, 2.0d) + Math.pow(this.f44694a - x0Var.f44694a, 2.0d));
    }

    public final x0 b(x0 x0Var) {
        return new x0((this.f44694a + x0Var.f44694a) * 0.5d, (this.f44695b + x0Var.f44695b) * 0.5d, (this.f44696c + x0Var.f44696c) * 0.5d);
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
        if (this.f44694a != x0Var.f44694a || this.f44695b != x0Var.f44695b || this.f44696c != x0Var.f44696c) {
            return false;
        }
        return true;
    }

    public x0(double d, double d10, double d11, int i10) {
        this.f44694a = d;
        this.f44695b = d10;
        this.f44696c = d11;
        this.d = true;
    }
}
