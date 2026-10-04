package pg;
public final class w0 {
    public final double f44668a;
    public final double f44669b;
    public final double f44670c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f44668a = d;
        this.f44669b = d10;
        this.f44670c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f44670c - w0Var.f44670c, 2.0d) + Math.pow(this.f44669b - w0Var.f44669b, 2.0d) + Math.pow(this.f44668a - w0Var.f44668a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f44668a + w0Var.f44668a) * 0.5d, (this.f44669b + w0Var.f44669b) * 0.5d, (this.f44670c + w0Var.f44670c) * 0.5d);
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
        if (this.f44668a != w0Var.f44668a || this.f44669b != w0Var.f44669b || this.f44670c != w0Var.f44670c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f44668a = d;
        this.f44669b = d10;
        this.f44670c = d11;
        this.d = true;
    }
}
