package pg;
public final class w0 {
    public final double f41297a;
    public final double f41298b;
    public final double f41299c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f41297a = d;
        this.f41298b = d10;
        this.f41299c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f41299c - w0Var.f41299c, 2.0d) + Math.pow(this.f41298b - w0Var.f41298b, 2.0d) + Math.pow(this.f41297a - w0Var.f41297a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f41297a + w0Var.f41297a) * 0.5d, (this.f41298b + w0Var.f41298b) * 0.5d, (this.f41299c + w0Var.f41299c) * 0.5d);
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
        if (this.f41297a != w0Var.f41297a || this.f41298b != w0Var.f41298b || this.f41299c != w0Var.f41299c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f41297a = d;
        this.f41298b = d10;
        this.f41299c = d11;
        this.d = true;
    }
}
