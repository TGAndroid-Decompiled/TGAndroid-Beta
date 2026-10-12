package pg;
public final class v0 {
    public final double f45703a;
    public final double f45704b;
    public final double f45705c;
    public boolean d;

    public v0(double d, double d10, double d11) {
        this.f45703a = d;
        this.f45704b = d10;
        this.f45705c = d11;
    }

    public final float a(v0 v0Var) {
        return (float) Math.sqrt(Math.pow(this.f45705c - v0Var.f45705c, 2.0d) + Math.pow(this.f45704b - v0Var.f45704b, 2.0d) + Math.pow(this.f45703a - v0Var.f45703a, 2.0d));
    }

    public final v0 b(v0 v0Var) {
        return new v0((this.f45703a + v0Var.f45703a) * 0.5d, (this.f45704b + v0Var.f45704b) * 0.5d, (this.f45705c + v0Var.f45705c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f45703a != v0Var.f45703a || this.f45704b != v0Var.f45704b || this.f45705c != v0Var.f45705c) {
            return false;
        }
        return true;
    }

    public v0(double d, double d10, double d11, int i10) {
        this.f45703a = d;
        this.f45704b = d10;
        this.f45705c = d11;
        this.d = true;
    }
}
