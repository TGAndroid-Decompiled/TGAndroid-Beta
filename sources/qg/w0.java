package qg;
public final class w0 {
    public final double f45111a;
    public final double f45112b;
    public final double f45113c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f45111a = d;
        this.f45112b = d10;
        this.f45113c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f45113c - w0Var.f45113c, 2.0d) + Math.pow(this.f45112b - w0Var.f45112b, 2.0d) + Math.pow(this.f45111a - w0Var.f45111a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f45111a + w0Var.f45111a) * 0.5d, (this.f45112b + w0Var.f45112b) * 0.5d, (this.f45113c + w0Var.f45113c) * 0.5d);
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
        if (this.f45111a != w0Var.f45111a || this.f45112b != w0Var.f45112b || this.f45113c != w0Var.f45113c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f45111a = d;
        this.f45112b = d10;
        this.f45113c = d11;
        this.d = true;
    }
}
