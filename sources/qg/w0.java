package qg;
public final class w0 {
    public final double f44690a;
    public final double f44691b;
    public final double f44692c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f44690a = d;
        this.f44691b = d10;
        this.f44692c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f44692c - w0Var.f44692c, 2.0d) + Math.pow(this.f44691b - w0Var.f44691b, 2.0d) + Math.pow(this.f44690a - w0Var.f44690a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f44690a + w0Var.f44690a) * 0.5d, (this.f44691b + w0Var.f44691b) * 0.5d, (this.f44692c + w0Var.f44692c) * 0.5d);
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
        if (this.f44690a != w0Var.f44690a || this.f44691b != w0Var.f44691b || this.f44692c != w0Var.f44692c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f44690a = d;
        this.f44691b = d10;
        this.f44692c = d11;
        this.d = true;
    }
}
