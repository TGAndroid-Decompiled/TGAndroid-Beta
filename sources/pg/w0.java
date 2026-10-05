package pg;
public final class w0 {
    public final double f44682a;
    public final double f44683b;
    public final double f44684c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f44682a = d;
        this.f44683b = d10;
        this.f44684c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f44684c - w0Var.f44684c, 2.0d) + Math.pow(this.f44683b - w0Var.f44683b, 2.0d) + Math.pow(this.f44682a - w0Var.f44682a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f44682a + w0Var.f44682a) * 0.5d, (this.f44683b + w0Var.f44683b) * 0.5d, (this.f44684c + w0Var.f44684c) * 0.5d);
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
        if (this.f44682a != w0Var.f44682a || this.f44683b != w0Var.f44683b || this.f44684c != w0Var.f44684c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f44682a = d;
        this.f44683b = d10;
        this.f44684c = d11;
        this.d = true;
    }
}
