package sg;
public final class n0 {
    public final double f55064a;
    public final double f55065b;
    public final double f55066c;
    public boolean d;

    public n0(double d, double d2, double d10) {
        this.f55064a = d;
        this.f55065b = d2;
        this.f55066c = d10;
    }

    public final float a(n0 n0Var) {
        return (float) Math.sqrt(Math.pow(this.f55066c - n0Var.f55066c, 2.0d) + Math.pow(this.f55065b - n0Var.f55065b, 2.0d) + Math.pow(this.f55064a - n0Var.f55064a, 2.0d));
    }

    public final n0 b(n0 n0Var) {
        return new n0((this.f55064a + n0Var.f55064a) * 0.5d, (this.f55065b + n0Var.f55065b) * 0.5d, (this.f55066c + n0Var.f55066c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.f55064a != n0Var.f55064a || this.f55065b != n0Var.f55065b || this.f55066c != n0Var.f55066c) {
            return false;
        }
        return true;
    }

    public n0(double d, double d2, double d10, int i7) {
        this.f55064a = d;
        this.f55065b = d2;
        this.f55066c = d10;
        this.d = true;
    }
}
