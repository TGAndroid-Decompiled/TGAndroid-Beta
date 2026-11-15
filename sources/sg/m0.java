package sg;
public final class m0 {
    public final double f56710a;
    public final double f56711b;
    public final double f56712c;
    public boolean d;

    public m0(double d, double d2, double d10) {
        this.f56710a = d;
        this.f56711b = d2;
        this.f56712c = d10;
    }

    public final float a(m0 m0Var) {
        return (float) Math.sqrt(Math.pow(this.f56712c - m0Var.f56712c, 2.0d) + Math.pow(this.f56711b - m0Var.f56711b, 2.0d) + Math.pow(this.f56710a - m0Var.f56710a, 2.0d));
    }

    public final m0 b(m0 m0Var) {
        return new m0((this.f56710a + m0Var.f56710a) * 0.5d, (this.f56711b + m0Var.f56711b) * 0.5d, (this.f56712c + m0Var.f56712c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (this.f56710a != m0Var.f56710a || this.f56711b != m0Var.f56711b || this.f56712c != m0Var.f56712c) {
            return false;
        }
        return true;
    }

    public m0(double d, double d2, double d10, int i7) {
        this.f56710a = d;
        this.f56711b = d2;
        this.f56712c = d10;
        this.d = true;
    }
}
