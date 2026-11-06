package sg;
public final class n0 {
    public final double f55063a;
    public final double f55064b;
    public final double f55065c;
    public boolean d;

    public n0(double d, double d2, double d10) {
        this.f55063a = d;
        this.f55064b = d2;
        this.f55065c = d10;
    }

    public final float a(n0 n0Var) {
        return (float) Math.sqrt(Math.pow(this.f55065c - n0Var.f55065c, 2.0d) + Math.pow(this.f55064b - n0Var.f55064b, 2.0d) + Math.pow(this.f55063a - n0Var.f55063a, 2.0d));
    }

    public final n0 b(n0 n0Var) {
        return new n0((this.f55063a + n0Var.f55063a) * 0.5d, (this.f55064b + n0Var.f55064b) * 0.5d, (this.f55065c + n0Var.f55065c) * 0.5d);
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
        if (this.f55063a != n0Var.f55063a || this.f55064b != n0Var.f55064b || this.f55065c != n0Var.f55065c) {
            return false;
        }
        return true;
    }

    public n0(double d, double d2, double d10, int i7) {
        this.f55063a = d;
        this.f55064b = d2;
        this.f55065c = d10;
        this.d = true;
    }
}
