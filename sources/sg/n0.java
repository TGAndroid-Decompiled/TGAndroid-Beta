package sg;
public final class n0 {
    public final double f55166a;
    public final double f55167b;
    public final double f55168c;
    public boolean d;

    public n0(double d, double d2, double d10) {
        this.f55166a = d;
        this.f55167b = d2;
        this.f55168c = d10;
    }

    public final float a(n0 n0Var) {
        return (float) Math.sqrt(Math.pow(this.f55168c - n0Var.f55168c, 2.0d) + Math.pow(this.f55167b - n0Var.f55167b, 2.0d) + Math.pow(this.f55166a - n0Var.f55166a, 2.0d));
    }

    public final n0 b(n0 n0Var) {
        return new n0((this.f55166a + n0Var.f55166a) * 0.5d, (this.f55167b + n0Var.f55167b) * 0.5d, (this.f55168c + n0Var.f55168c) * 0.5d);
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
        if (this.f55166a != n0Var.f55166a || this.f55167b != n0Var.f55167b || this.f55168c != n0Var.f55168c) {
            return false;
        }
        return true;
    }

    public n0(double d, double d2, double d10, int i7) {
        this.f55166a = d;
        this.f55167b = d2;
        this.f55168c = d10;
        this.d = true;
    }
}
