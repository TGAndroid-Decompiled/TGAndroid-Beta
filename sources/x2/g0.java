package x2;
public final class g0 {
    public final Object f58339a;
    public final int f58340b;
    public final int f58341c;
    public final long d;
    public final int f58342e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f58339a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f58340b, this.f58341c, this.f58342e, j3, obj);
    }

    public final boolean b() {
        if (this.f58340b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f58339a.equals(g0Var.f58339a) && this.f58340b == g0Var.f58340b && this.f58341c == g0Var.f58341c && this.d == g0Var.d && this.f58342e == g0Var.f58342e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f58339a.hashCode() + 527) * 31) + this.f58340b) * 31) + this.f58341c) * 31) + ((int) this.d)) * 31) + this.f58342e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public g0(int i7, int i10, int i11, long j3, Object obj) {
        this.f58339a = obj;
        this.f58340b = i7;
        this.f58341c = i10;
        this.d = j3;
        this.f58342e = i11;
    }
}
