package pg;
public final class w0 {
    public final double f41328a;
    public final double f41329b;
    public final double f41330c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f41328a = d;
        this.f41329b = d10;
        this.f41330c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f41330c - w0Var.f41330c, 2.0d) + Math.pow(this.f41329b - w0Var.f41329b, 2.0d) + Math.pow(this.f41328a - w0Var.f41328a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f41328a + w0Var.f41328a) * 0.5d, (this.f41329b + w0Var.f41329b) * 0.5d, (this.f41330c + w0Var.f41330c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f41328a != w0Var.f41328a || this.f41329b != w0Var.f41329b || this.f41330c != w0Var.f41330c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f41328a = d;
        this.f41329b = d10;
        this.f41330c = d11;
        this.d = true;
    }
}
