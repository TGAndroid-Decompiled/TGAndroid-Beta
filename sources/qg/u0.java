package qg;
public final class u0 {
    public final double f43330a;
    public final double f43331b;
    public final double f43332c;
    public boolean d;

    public u0(double d, double d10, double d11) {
        this.f43330a = d;
        this.f43331b = d10;
        this.f43332c = d11;
    }

    public final float a(u0 u0Var) {
        return (float) Math.sqrt(Math.pow(this.f43332c - u0Var.f43332c, 2.0d) + Math.pow(this.f43331b - u0Var.f43331b, 2.0d) + Math.pow(this.f43330a - u0Var.f43330a, 2.0d));
    }

    public final u0 b(u0 u0Var) {
        return new u0((this.f43330a + u0Var.f43330a) * 0.5d, (this.f43331b + u0Var.f43331b) * 0.5d, (this.f43332c + u0Var.f43332c) * 0.5d);
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
        if (this.f43330a != u0Var.f43330a || this.f43331b != u0Var.f43331b || this.f43332c != u0Var.f43332c) {
            return false;
        }
        return true;
    }

    public u0(double d, double d10, double d11, int i10) {
        this.f43330a = d;
        this.f43331b = d10;
        this.f43332c = d11;
        this.d = true;
    }
}
