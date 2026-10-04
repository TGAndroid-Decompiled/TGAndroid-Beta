package pg;
public final class w0 {
    public final double f44675a;
    public final double f44676b;
    public final double f44677c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f44675a = d;
        this.f44676b = d10;
        this.f44677c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f44677c - w0Var.f44677c, 2.0d) + Math.pow(this.f44676b - w0Var.f44676b, 2.0d) + Math.pow(this.f44675a - w0Var.f44675a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f44675a + w0Var.f44675a) * 0.5d, (this.f44676b + w0Var.f44676b) * 0.5d, (this.f44677c + w0Var.f44677c) * 0.5d);
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
        if (this.f44675a != w0Var.f44675a || this.f44676b != w0Var.f44676b || this.f44677c != w0Var.f44677c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f44675a = d;
        this.f44676b = d10;
        this.f44677c = d11;
        this.d = true;
    }
}
