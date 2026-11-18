package sg;
public final class m0 {
    public final double f57284a;
    public final double f57285b;
    public final double f57286c;
    public boolean d;

    public m0(double d, double d2, double d10) {
        this.f57284a = d;
        this.f57285b = d2;
        this.f57286c = d10;
    }

    public final float a(m0 m0Var) {
        return (float) Math.sqrt(Math.pow(this.f57286c - m0Var.f57286c, 2.0d) + Math.pow(this.f57285b - m0Var.f57285b, 2.0d) + Math.pow(this.f57284a - m0Var.f57284a, 2.0d));
    }

    public final m0 b(m0 m0Var) {
        return new m0((this.f57284a + m0Var.f57284a) * 0.5d, (this.f57285b + m0Var.f57285b) * 0.5d, (this.f57286c + m0Var.f57286c) * 0.5d);
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
        if (this.f57284a != m0Var.f57284a || this.f57285b != m0Var.f57285b || this.f57286c != m0Var.f57286c) {
            return false;
        }
        return true;
    }

    public m0(double d, double d2, double d10, int i7) {
        this.f57284a = d;
        this.f57285b = d2;
        this.f57286c = d10;
        this.d = true;
    }
}
