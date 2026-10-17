package qg;
public final class w0 {
    public final double f44713a;
    public final double f44714b;
    public final double f44715c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f44713a = d;
        this.f44714b = d10;
        this.f44715c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f44715c - w0Var.f44715c, 2.0d) + Math.pow(this.f44714b - w0Var.f44714b, 2.0d) + Math.pow(this.f44713a - w0Var.f44713a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f44713a + w0Var.f44713a) * 0.5d, (this.f44714b + w0Var.f44714b) * 0.5d, (this.f44715c + w0Var.f44715c) * 0.5d);
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
        if (this.f44713a != w0Var.f44713a || this.f44714b != w0Var.f44714b || this.f44715c != w0Var.f44715c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f44713a = d;
        this.f44714b = d10;
        this.f44715c = d11;
        this.d = true;
    }
}
