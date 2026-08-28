package xf;
public final class u0 {
    public final double f49384a;
    public final double f49385b;
    public final double f49386c;
    public boolean d;

    public u0(double d, double d9, double d10) {
        this.f49384a = d;
        this.f49385b = d9;
        this.f49386c = d10;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f49386c - u0Var.f49386c, 2.0d) + Math.pow(this.f49385b - u0Var.f49385b, 2.0d) + Math.pow(this.f49384a - u0Var.f49384a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f49384a + u0Var.f49384a) * 0.5d, (this.f49385b + u0Var.f49385b) * 0.5d, (this.f49386c + u0Var.f49386c) * 0.5d);
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
        if (this.f49384a != u0Var.f49384a || this.f49385b != u0Var.f49385b || this.f49386c != u0Var.f49386c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d9, double d10, int i9) {
        this.f49384a = d;
        this.f49385b = d9;
        this.f49386c = d10;
        this.d = true;
    }
}
