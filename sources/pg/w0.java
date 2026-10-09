package pg;
public final class w0 {
    public final double f45829a;
    public final double f45830b;
    public final double f45831c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f45829a = d;
        this.f45830b = d10;
        this.f45831c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f45831c - w0Var.f45831c, 2.0d) + Math.pow(this.f45830b - w0Var.f45830b, 2.0d) + Math.pow(this.f45829a - w0Var.f45829a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f45829a + w0Var.f45829a) * 0.5d, (this.f45830b + w0Var.f45830b) * 0.5d, (this.f45831c + w0Var.f45831c) * 0.5d);
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
        if (this.f45829a != w0Var.f45829a || this.f45830b != w0Var.f45830b || this.f45831c != w0Var.f45831c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f45829a = d;
        this.f45830b = d10;
        this.f45831c = d11;
        this.d = true;
    }
}
