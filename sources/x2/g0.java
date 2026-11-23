package x2;
public final class g0 {
    public final Object f60098a;
    public final int f60099b;
    public final int f60100c;
    public final long d;
    public final int f60101e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f60098a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f60099b, this.f60100c, this.f60101e, j3, obj);
    }

    public final boolean b() {
        if (this.f60099b != -1) {
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
        if (this.f60098a.equals(g0Var.f60098a) && this.f60099b == g0Var.f60099b && this.f60100c == g0Var.f60100c && this.d == g0Var.d && this.f60101e == g0Var.f60101e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f60098a.hashCode() + 527) * 31) + this.f60099b) * 31) + this.f60100c) * 31) + ((int) this.d)) * 31) + this.f60101e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public g0(int i7, int i10, int i11, long j3, Object obj) {
        this.f60098a = obj;
        this.f60099b = i7;
        this.f60100c = i10;
        this.d = j3;
        this.f60101e = i11;
    }
}
