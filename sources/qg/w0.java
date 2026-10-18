package qg;
public final class w0 {
    public final double f44733a;
    public final double f44734b;
    public final double f44735c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f44733a = d;
        this.f44734b = d10;
        this.f44735c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f44735c - w0Var.f44735c, 2.0d) + Math.pow(this.f44734b - w0Var.f44734b, 2.0d) + Math.pow(this.f44733a - w0Var.f44733a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f44733a + w0Var.f44733a) * 0.5d, (this.f44734b + w0Var.f44734b) * 0.5d, (this.f44735c + w0Var.f44735c) * 0.5d);
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
        if (this.f44733a != w0Var.f44733a || this.f44734b != w0Var.f44734b || this.f44735c != w0Var.f44735c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f44733a = d;
        this.f44734b = d10;
        this.f44735c = d11;
        this.d = true;
    }
}
