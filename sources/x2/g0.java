package x2;
public final class g0 {
    public final Object f60087a;
    public final int f60088b;
    public final int f60089c;
    public final long d;
    public final int f60090e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f60087a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f60088b, this.f60089c, this.f60090e, j3, obj);
    }

    public final boolean b() {
        if (this.f60088b != -1) {
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
        if (this.f60087a.equals(g0Var.f60087a) && this.f60088b == g0Var.f60088b && this.f60089c == g0Var.f60089c && this.d == g0Var.d && this.f60090e == g0Var.f60090e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f60087a.hashCode() + 527) * 31) + this.f60088b) * 31) + this.f60089c) * 31) + ((int) this.d)) * 31) + this.f60090e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public g0(int i7, int i10, int i11, long j3, Object obj) {
        this.f60087a = obj;
        this.f60088b = i7;
        this.f60089c = i10;
        this.d = j3;
        this.f60090e = i11;
    }
}
