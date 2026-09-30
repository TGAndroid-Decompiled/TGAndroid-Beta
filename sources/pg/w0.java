package pg;
public final class w0 {
    public final double f41300a;
    public final double f41301b;
    public final double f41302c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f41300a = d;
        this.f41301b = d10;
        this.f41302c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f41302c - w0Var.f41302c, 2.0d) + Math.pow(this.f41301b - w0Var.f41301b, 2.0d) + Math.pow(this.f41300a - w0Var.f41300a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f41300a + w0Var.f41300a) * 0.5d, (this.f41301b + w0Var.f41301b) * 0.5d, (this.f41302c + w0Var.f41302c) * 0.5d);
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
        if (this.f41300a != w0Var.f41300a || this.f41301b != w0Var.f41301b || this.f41302c != w0Var.f41302c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f41300a = d;
        this.f41301b = d10;
        this.f41302c = d11;
        this.d = true;
    }
}
