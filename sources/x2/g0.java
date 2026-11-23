package x2;
public final class g0 {
    public final Object f60216a;
    public final int f60217b;
    public final int f60218c;
    public final long d;
    public final int f60219e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f60216a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f60217b, this.f60218c, this.f60219e, j3, obj);
    }

    public final boolean b() {
        if (this.f60217b != -1) {
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
        if (this.f60216a.equals(g0Var.f60216a) && this.f60217b == g0Var.f60217b && this.f60218c == g0Var.f60218c && this.d == g0Var.d && this.f60219e == g0Var.f60219e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f60216a.hashCode() + 527) * 31) + this.f60217b) * 31) + this.f60218c) * 31) + ((int) this.d)) * 31) + this.f60219e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public g0(int i7, int i10, int i11, long j3, Object obj) {
        this.f60216a = obj;
        this.f60217b = i7;
        this.f60218c = i10;
        this.d = j3;
        this.f60219e = i11;
    }
}
