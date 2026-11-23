package sg;
public final class m0 {
    public final double f57294a;
    public final double f57295b;
    public final double f57296c;
    public boolean d;

    public m0(double d, double d2, double d10) {
        this.f57294a = d;
        this.f57295b = d2;
        this.f57296c = d10;
    }

    public final float a(m0 m0Var) {
        return (float) Math.sqrt(Math.pow(this.f57296c - m0Var.f57296c, 2.0d) + Math.pow(this.f57295b - m0Var.f57295b, 2.0d) + Math.pow(this.f57294a - m0Var.f57294a, 2.0d));
    }

    public final m0 b(m0 m0Var) {
        return new m0((this.f57294a + m0Var.f57294a) * 0.5d, (this.f57295b + m0Var.f57295b) * 0.5d, (this.f57296c + m0Var.f57296c) * 0.5d);
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
        if (this.f57294a != m0Var.f57294a || this.f57295b != m0Var.f57295b || this.f57296c != m0Var.f57296c) {
            return false;
        }
        return true;
    }

    public m0(double d, double d2, double d10, int i7) {
        this.f57294a = d;
        this.f57295b = d2;
        this.f57296c = d10;
        this.d = true;
    }
}
