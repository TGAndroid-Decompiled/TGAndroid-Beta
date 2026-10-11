package pg;
public final class w0 {
    public final double f45897a;
    public final double f45898b;
    public final double f45899c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f45897a = d;
        this.f45898b = d10;
        this.f45899c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f45899c - w0Var.f45899c, 2.0d) + Math.pow(this.f45898b - w0Var.f45898b, 2.0d) + Math.pow(this.f45897a - w0Var.f45897a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f45897a + w0Var.f45897a) * 0.5d, (this.f45898b + w0Var.f45898b) * 0.5d, (this.f45899c + w0Var.f45899c) * 0.5d);
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
        if (this.f45897a != w0Var.f45897a || this.f45898b != w0Var.f45898b || this.f45899c != w0Var.f45899c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f45897a = d;
        this.f45898b = d10;
        this.f45899c = d11;
        this.d = true;
    }
}
