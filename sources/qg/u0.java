package qg;
public final class u0 {
    public final double f44620a;
    public final double f44621b;
    public final double f44622c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f44620a = d;
        this.f44621b = d10;
        this.f44622c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f44622c - u0Var.f44622c, 2.0d) + Math.pow(this.f44621b - u0Var.f44621b, 2.0d) + Math.pow(this.f44620a - u0Var.f44620a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f44620a + u0Var.f44620a) * 0.5d, (this.f44621b + u0Var.f44621b) * 0.5d, (this.f44622c + u0Var.f44622c) * 0.5d);
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
        if (this.f44620a != u0Var.f44620a || this.f44621b != u0Var.f44621b || this.f44622c != u0Var.f44622c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f44620a = d;
        this.f44621b = d10;
        this.f44622c = d11;
        this.d = true;
    }
}
