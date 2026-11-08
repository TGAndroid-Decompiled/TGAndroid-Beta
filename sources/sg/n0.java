package sg;
public final class n0 {
    public final double f55156a;
    public final double f55157b;
    public final double f55158c;
    public boolean d;

    public n0(double d, double d2, double d10) {
        this.f55156a = d;
        this.f55157b = d2;
        this.f55158c = d10;
    }

    public final float a(n0 n0Var) {
        return (float) Math.sqrt(Math.pow(this.f55158c - n0Var.f55158c, 2.0d) + Math.pow(this.f55157b - n0Var.f55157b, 2.0d) + Math.pow(this.f55156a - n0Var.f55156a, 2.0d));
    }

    public final n0 b(n0 n0Var) {
        return new n0((this.f55156a + n0Var.f55156a) * 0.5d, (this.f55157b + n0Var.f55157b) * 0.5d, (this.f55158c + n0Var.f55158c) * 0.5d);
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
        if (this.f55156a != n0Var.f55156a || this.f55157b != n0Var.f55157b || this.f55158c != n0Var.f55158c) {
            return false;
        }
        return true;
    }

    public n0(double d, double d2, double d10, int i7) {
        this.f55156a = d;
        this.f55157b = d2;
        this.f55158c = d10;
        this.d = true;
    }
}
