package pg;
public final class w0 {
    public final double f41347a;
    public final double f41348b;
    public final double f41349c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f41347a = d;
        this.f41348b = d10;
        this.f41349c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f41349c - w0Var.f41349c, 2.0d) + Math.pow(this.f41348b - w0Var.f41348b, 2.0d) + Math.pow(this.f41347a - w0Var.f41347a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f41347a + w0Var.f41347a) * 0.5d, (this.f41348b + w0Var.f41348b) * 0.5d, (this.f41349c + w0Var.f41349c) * 0.5d);
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
        if (this.f41347a != w0Var.f41347a || this.f41348b != w0Var.f41348b || this.f41349c != w0Var.f41349c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f41347a = d;
        this.f41348b = d10;
        this.f41349c = d11;
        this.d = true;
    }
}
