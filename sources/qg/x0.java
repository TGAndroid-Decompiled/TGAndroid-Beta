package qg;
public final class x0 {
    public final double f44705a;
    public final double f44706b;
    public final double f44707c;
    public boolean d;

    public x0(double d, double d10, double d11) {
        this.f44705a = d;
        this.f44706b = d10;
        this.f44707c = d11;
    }

    public final float a(x0 x0Var) {
        return (float) Math.sqrt(Math.pow(this.f44707c - x0Var.f44707c, 2.0d) + Math.pow(this.f44706b - x0Var.f44706b, 2.0d) + Math.pow(this.f44705a - x0Var.f44705a, 2.0d));
    }

    public final x0 b(x0 x0Var) {
        return new x0((this.f44705a + x0Var.f44705a) * 0.5d, (this.f44706b + x0Var.f44706b) * 0.5d, (this.f44707c + x0Var.f44707c) * 0.5d);
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
        if (this.f44705a != x0Var.f44705a || this.f44706b != x0Var.f44706b || this.f44707c != x0Var.f44707c) {
            return false;
        }
        return true;
    }

    public x0(double d, double d10, double d11, int i10) {
        this.f44705a = d;
        this.f44706b = d10;
        this.f44707c = d11;
        this.d = true;
    }
}
