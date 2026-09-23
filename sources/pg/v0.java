package pg;
public final class v0 {
    public final double f40973a;
    public final double f40974b;
    public final double f40975c;
    public boolean d;

    public v0(double d, double d10, double d11) {
        this.f40973a = d;
        this.f40974b = d10;
        this.f40975c = d11;
    }

    public final float a(v0 v0Var) {
        return (float) Math.sqrt(Math.pow(this.f40975c - v0Var.f40975c, 2.0d) + Math.pow(this.f40974b - v0Var.f40974b, 2.0d) + Math.pow(this.f40973a - v0Var.f40973a, 2.0d));
    }

    public final v0 b(v0 v0Var) {
        return new v0((this.f40973a + v0Var.f40973a) * 0.5d, (this.f40974b + v0Var.f40974b) * 0.5d, (this.f40975c + v0Var.f40975c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f40973a != v0Var.f40973a || this.f40974b != v0Var.f40974b || this.f40975c != v0Var.f40975c) {
            return false;
        }
        return true;
    }

    public v0(double d, double d10, double d11, int i10) {
        this.f40973a = d;
        this.f40974b = d10;
        this.f40975c = d11;
        this.d = true;
    }
}
