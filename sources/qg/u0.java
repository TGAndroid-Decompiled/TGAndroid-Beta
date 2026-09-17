package qg;
public final class u0 {
    public final double f44621a;
    public final double f44622b;
    public final double f44623c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f44621a = d;
        this.f44622b = d10;
        this.f44623c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f44623c - u0Var.f44623c, 2.0d) + Math.pow(this.f44622b - u0Var.f44622b, 2.0d) + Math.pow(this.f44621a - u0Var.f44621a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f44621a + u0Var.f44621a) * 0.5d, (this.f44622b + u0Var.f44622b) * 0.5d, (this.f44623c + u0Var.f44623c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f44621a != u0Var.f44621a || this.f44622b != u0Var.f44622b || this.f44623c != u0Var.f44623c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f44621a = d;
        this.f44622b = d10;
        this.f44623c = d11;
        this.d = true;
    }
}
