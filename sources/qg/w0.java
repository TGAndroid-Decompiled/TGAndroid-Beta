package qg;
public final class w0 {
    public final double f45112a;
    public final double f45113b;
    public final double f45114c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f45112a = d;
        this.f45113b = d10;
        this.f45114c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f45114c - w0Var.f45114c, 2.0d) + Math.pow(this.f45113b - w0Var.f45113b, 2.0d) + Math.pow(this.f45112a - w0Var.f45112a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f45112a + w0Var.f45112a) * 0.5d, (this.f45113b + w0Var.f45113b) * 0.5d, (this.f45114c + w0Var.f45114c) * 0.5d);
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
        if (this.f45112a != w0Var.f45112a || this.f45113b != w0Var.f45113b || this.f45114c != w0Var.f45114c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f45112a = d;
        this.f45113b = d10;
        this.f45114c = d11;
        this.d = true;
    }
}
