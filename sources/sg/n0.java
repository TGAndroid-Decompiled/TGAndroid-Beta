package sg;
public final class n0 {
    public final double f55039a;
    public final double f55040b;
    public final double f55041c;
    public boolean d;

    public n0(double d, double d2, double d10) {
        this.f55039a = d;
        this.f55040b = d2;
        this.f55041c = d10;
    }

    public final float a(n0 n0Var) {
        return (float) Math.sqrt(Math.pow(this.f55041c - n0Var.f55041c, 2.0d) + Math.pow(this.f55040b - n0Var.f55040b, 2.0d) + Math.pow(this.f55039a - n0Var.f55039a, 2.0d));
    }

    public final n0 b(n0 n0Var) {
        return new n0((this.f55039a + n0Var.f55039a) * 0.5d, (this.f55040b + n0Var.f55040b) * 0.5d, (this.f55041c + n0Var.f55041c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (this.f55039a != n0Var.f55039a || this.f55040b != n0Var.f55040b || this.f55041c != n0Var.f55041c) {
            return false;
        }
        return true;
    }

    public n0(double d, double d2, double d10, int i7) {
        this.f55039a = d;
        this.f55040b = d2;
        this.f55041c = d10;
        this.d = true;
    }
}
