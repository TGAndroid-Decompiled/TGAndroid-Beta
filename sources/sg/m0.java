package sg;
public final class m0 {
    public final double f57325a;
    public final double f57326b;
    public final double f57327c;
    public boolean d;

    public m0(double d, double d2, double d10) {
        this.f57325a = d;
        this.f57326b = d2;
        this.f57327c = d10;
    }

    public final float a(m0 m0Var) {
        return (float) Math.sqrt(Math.pow(this.f57327c - m0Var.f57327c, 2.0d) + Math.pow(this.f57326b - m0Var.f57326b, 2.0d) + Math.pow(this.f57325a - m0Var.f57325a, 2.0d));
    }

    public final m0 b(m0 m0Var) {
        return new m0((this.f57325a + m0Var.f57325a) * 0.5d, (this.f57326b + m0Var.f57326b) * 0.5d, (this.f57327c + m0Var.f57327c) * 0.5d);
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
        if (this.f57325a != m0Var.f57325a || this.f57326b != m0Var.f57326b || this.f57327c != m0Var.f57327c) {
            return false;
        }
        return true;
    }

    public m0(double d, double d2, double d10, int i7) {
        this.f57325a = d;
        this.f57326b = d2;
        this.f57327c = d10;
        this.d = true;
    }
}
