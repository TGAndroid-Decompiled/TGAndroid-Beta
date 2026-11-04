package tg;
public final class m0 {
    public final double f55252a;
    public final double f55253b;
    public final double f55254c;
    public boolean d;

    public m0(double d, double d10, double d11) {
        this.f55252a = d;
        this.f55253b = d10;
        this.f55254c = d11;
    }

    public final float a(m0 m0Var) {
        return (float) Math.sqrt(Math.pow(this.f55254c - m0Var.f55254c, 2.0d) + Math.pow(this.f55253b - m0Var.f55253b, 2.0d) + Math.pow(this.f55252a - m0Var.f55252a, 2.0d));
    }

    public final m0 b(m0 m0Var) {
        return new m0((this.f55252a + m0Var.f55252a) * 0.5d, (this.f55253b + m0Var.f55253b) * 0.5d, (this.f55254c + m0Var.f55254c) * 0.5d);
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
        if (this.f55252a != m0Var.f55252a || this.f55253b != m0Var.f55253b || this.f55254c != m0Var.f55254c) {
            return false;
        }
        return true;
    }

    public m0(double d, double d10, double d11, int i3) {
        this.f55252a = d;
        this.f55253b = d10;
        this.f55254c = d11;
        this.d = true;
    }
}
