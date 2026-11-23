package sg;
public final class l0 {
    public final double f57398a;
    public final double f57399b;
    public final double f57400c;
    public boolean d;

    public l0(double d, double d2, double d10) {
        this.f57398a = d;
        this.f57399b = d2;
        this.f57400c = d10;
    }

    public final float a(l0 l0Var) {
        return (float) Math.sqrt(Math.pow(this.f57400c - l0Var.f57400c, 2.0d) + Math.pow(this.f57399b - l0Var.f57399b, 2.0d) + Math.pow(this.f57398a - l0Var.f57398a, 2.0d));
    }

    public final l0 b(l0 l0Var) {
        return new l0((this.f57398a + l0Var.f57398a) * 0.5d, (this.f57399b + l0Var.f57399b) * 0.5d, (this.f57400c + l0Var.f57400c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f57398a != l0Var.f57398a || this.f57399b != l0Var.f57399b || this.f57400c != l0Var.f57400c) {
            return false;
        }
        return true;
    }

    public l0(double d, double d2, double d10, int i7) {
        this.f57398a = d;
        this.f57399b = d2;
        this.f57400c = d10;
        this.d = true;
    }
}
