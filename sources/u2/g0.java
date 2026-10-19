package u2;
public final class g0 {
    public final Object f47304a;
    public final int f47305b;
    public final int f47306c;
    public final long d;
    public final int e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f47304a.equals(obj)) {
            return this;
        }
        long j10 = this.d;
        return new g0(this.f47305b, this.f47306c, this.e, j10, obj);
    }

    public final boolean b() {
        if (this.f47305b != -1) {
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
        if (this.f47304a.equals(g0Var.f47304a) && this.f47305b == g0Var.f47305b && this.f47306c == g0Var.f47306c && this.d == g0Var.d && this.e == g0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f47304a.hashCode() + 527) * 31) + this.f47305b) * 31) + this.f47306c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public g0(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public g0(Object obj, long j10, int i10) {
        this(-1, -1, i10, j10, obj);
    }

    public g0(int i10, int i11, int i12, long j10, Object obj) {
        this.f47304a = obj;
        this.f47305b = i10;
        this.f47306c = i11;
        this.d = j10;
        this.e = i12;
    }
}
