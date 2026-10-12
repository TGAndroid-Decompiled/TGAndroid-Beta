package pg;
public final class v0 {
    public final double f45708a;
    public final double f45709b;
    public final double f45710c;
    public boolean d;

    public v0(double d, double d10, double d11) {
        this.f45708a = d;
        this.f45709b = d10;
        this.f45710c = d11;
    }

    public final float a(v0 v0Var) {
        return (float) Math.sqrt(Math.pow(this.f45710c - v0Var.f45710c, 2.0d) + Math.pow(this.f45709b - v0Var.f45709b, 2.0d) + Math.pow(this.f45708a - v0Var.f45708a, 2.0d));
    }

    public final v0 b(v0 v0Var) {
        return new v0((this.f45708a + v0Var.f45708a) * 0.5d, (this.f45709b + v0Var.f45709b) * 0.5d, (this.f45710c + v0Var.f45710c) * 0.5d);
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
        if (this.f45708a != v0Var.f45708a || this.f45709b != v0Var.f45709b || this.f45710c != v0Var.f45710c) {
            return false;
        }
        return true;
    }

    public v0(double d, double d10, double d11, int i10) {
        this.f45708a = d;
        this.f45709b = d10;
        this.f45710c = d11;
        this.d = true;
    }
}
