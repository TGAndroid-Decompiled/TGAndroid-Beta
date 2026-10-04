package pg;
public final class w0 {
    public final double f44667a;
    public final double f44668b;
    public final double f44669c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f44667a = d;
        this.f44668b = d10;
        this.f44669c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f44669c - w0Var.f44669c, 2.0d) + Math.pow(this.f44668b - w0Var.f44668b, 2.0d) + Math.pow(this.f44667a - w0Var.f44667a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f44667a + w0Var.f44667a) * 0.5d, (this.f44668b + w0Var.f44668b) * 0.5d, (this.f44669c + w0Var.f44669c) * 0.5d);
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
        if (this.f44667a != w0Var.f44667a || this.f44668b != w0Var.f44668b || this.f44669c != w0Var.f44669c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f44667a = d;
        this.f44668b = d10;
        this.f44669c = d11;
        this.d = true;
    }
}
