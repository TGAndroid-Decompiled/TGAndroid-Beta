package pg;
public final class w0 {
    public final double f45873a;
    public final double f45874b;
    public final double f45875c;
    public boolean d;

    public w0(double d, double d10, double d11) {
        this.f45873a = d;
        this.f45874b = d10;
        this.f45875c = d11;
    }

    public final float a(w0 w0Var) {
        return (float) Math.sqrt(Math.pow(this.f45875c - w0Var.f45875c, 2.0d) + Math.pow(this.f45874b - w0Var.f45874b, 2.0d) + Math.pow(this.f45873a - w0Var.f45873a, 2.0d));
    }

    public final w0 b(w0 w0Var) {
        return new w0((this.f45873a + w0Var.f45873a) * 0.5d, (this.f45874b + w0Var.f45874b) * 0.5d, (this.f45875c + w0Var.f45875c) * 0.5d);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.f45873a != w0Var.f45873a || this.f45874b != w0Var.f45874b || this.f45875c != w0Var.f45875c) {
            return false;
        }
        return true;
    }

    public w0(double d, double d10, double d11, int i10) {
        this.f45873a = d;
        this.f45874b = d10;
        this.f45875c = d11;
        this.d = true;
    }
}
