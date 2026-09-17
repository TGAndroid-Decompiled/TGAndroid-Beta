package pg;
public final class u0 {
    public final double f41037a;
    public final double f41038b;
    public final double f41039c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f41037a = d;
        this.f41038b = d10;
        this.f41039c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f41039c - u0Var.f41039c, 2.0d) + Math.pow(this.f41038b - u0Var.f41038b, 2.0d) + Math.pow(this.f41037a - u0Var.f41037a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f41037a + u0Var.f41037a) * 0.5d, (this.f41038b + u0Var.f41038b) * 0.5d, (this.f41039c + u0Var.f41039c) * 0.5d);
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
        if (this.f41037a != u0Var.f41037a || this.f41038b != u0Var.f41038b || this.f41039c != u0Var.f41039c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f41037a = d;
        this.f41038b = d10;
        this.f41039c = d11;
        this.d = true;
    }
}
