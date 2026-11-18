package x2;
public final class g0 {
    public final Object f60088a;
    public final int f60089b;
    public final int f60090c;
    public final long d;
    public final int f60091e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f60088a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f60089b, this.f60090c, this.f60091e, j3, obj);
    }

    public final boolean b() {
        if (this.f60089b != -1) {
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
        if (this.f60088a.equals(g0Var.f60088a) && this.f60089b == g0Var.f60089b && this.f60090c == g0Var.f60090c && this.d == g0Var.d && this.f60091e == g0Var.f60091e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f60088a.hashCode() + 527) * 31) + this.f60089b) * 31) + this.f60090c) * 31) + ((int) this.d)) * 31) + this.f60091e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public g0(int i7, int i10, int i11, long j3, Object obj) {
        this.f60088a = obj;
        this.f60089b = i7;
        this.f60090c = i10;
        this.d = j3;
        this.f60091e = i11;
    }
}
