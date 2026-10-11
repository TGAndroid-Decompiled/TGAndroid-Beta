package pg;
public final class w0 {
    public final double f45863a;
    public final double f45864b;
    public final double f45865c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f45863a = d;
        this.f45864b = d10;
        this.f45865c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f45865c - w0Var.f45865c, 2.0d) + Math.pow(this.f45864b - w0Var.f45864b, 2.0d) + Math.pow(this.f45863a - w0Var.f45863a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f45863a + w0Var.f45863a) * 0.5d, (this.f45864b + w0Var.f45864b) * 0.5d, (this.f45865c + w0Var.f45865c) * 0.5d);
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
        if (this.f45863a != w0Var.f45863a || this.f45864b != w0Var.f45864b || this.f45865c != w0Var.f45865c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f45863a = d;
        this.f45864b = d10;
        this.f45865c = d11;
        this.d = true;
    }
}
