package sg;
public final class m0 {
    public final double f57329a;
    public final double f57330b;
    public final double f57331c;
    public boolean d;

    public m0(double d, double d2, double d10) {
        this.f57329a = d;
        this.f57330b = d2;
        this.f57331c = d10;
    }

    public final float a(m0 m0Var) {
        return (float) Math.sqrt(Math.pow(this.f57331c - m0Var.f57331c, 2.0d) + Math.pow(this.f57330b - m0Var.f57330b, 2.0d) + Math.pow(this.f57329a - m0Var.f57329a, 2.0d));
    }

    public final m0 b(m0 m0Var) {
        return new m0((this.f57329a + m0Var.f57329a) * 0.5d, (this.f57330b + m0Var.f57330b) * 0.5d, (this.f57331c + m0Var.f57331c) * 0.5d);
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
        if (this.f57329a != m0Var.f57329a || this.f57330b != m0Var.f57330b || this.f57331c != m0Var.f57331c) {
            return false;
        }
        return true;
    }

    public m0(double d, double d2, double d10, int i7) {
        this.f57329a = d;
        this.f57330b = d2;
        this.f57331c = d10;
        this.d = true;
    }
}
