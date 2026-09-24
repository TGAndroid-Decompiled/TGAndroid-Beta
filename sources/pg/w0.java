package pg;
public final class w0 {
    public final double f41284a;
    public final double f41285b;
    public final double f41286c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f41284a = d;
        this.f41285b = d10;
        this.f41286c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f41286c - w0Var.f41286c, 2.0d) + Math.pow(this.f41285b - w0Var.f41285b, 2.0d) + Math.pow(this.f41284a - w0Var.f41284a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f41284a + w0Var.f41284a) * 0.5d, (this.f41285b + w0Var.f41285b) * 0.5d, (this.f41286c + w0Var.f41286c) * 0.5d);
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
        if (this.f41284a != w0Var.f41284a || this.f41285b != w0Var.f41285b || this.f41286c != w0Var.f41286c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f41284a = d;
        this.f41285b = d10;
        this.f41286c = d11;
        this.d = true;
    }
}
