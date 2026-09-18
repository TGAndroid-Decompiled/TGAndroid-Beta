package pg;
public final class w0 {
    public final double f41287a;
    public final double f41288b;
    public final double f41289c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f41287a = d;
        this.f41288b = d10;
        this.f41289c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f41289c - w0Var.f41289c, 2.0d) + Math.pow(this.f41288b - w0Var.f41288b, 2.0d) + Math.pow(this.f41287a - w0Var.f41287a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f41287a + w0Var.f41287a) * 0.5d, (this.f41288b + w0Var.f41288b) * 0.5d, (this.f41289c + w0Var.f41289c) * 0.5d);
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
        if (this.f41287a != w0Var.f41287a || this.f41288b != w0Var.f41288b || this.f41289c != w0Var.f41289c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f41287a = d;
        this.f41288b = d10;
        this.f41289c = d11;
        this.d = true;
    }
}
