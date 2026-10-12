package qg;
public final class u0 {
    public final double f43588a;
    public final double f43589b;
    public final double f43590c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f43588a = d;
        this.f43589b = d10;
        this.f43590c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f43590c - u0Var.f43590c, 2.0d) + Math.pow(this.f43589b - u0Var.f43589b, 2.0d) + Math.pow(this.f43588a - u0Var.f43588a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f43588a + u0Var.f43588a) * 0.5d, (this.f43589b + u0Var.f43589b) * 0.5d, (this.f43590c + u0Var.f43590c) * 0.5d);
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
        if (this.f43588a != u0Var.f43588a || this.f43589b != u0Var.f43589b || this.f43590c != u0Var.f43590c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f43588a = d;
        this.f43589b = d10;
        this.f43590c = d11;
        this.d = true;
    }
}
