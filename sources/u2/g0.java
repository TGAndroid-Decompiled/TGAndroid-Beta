package u2;
public final class g0 {
    public final Object f42324a;
    public final int f42325b;
    public final int f42326c;
    public final long d;
    public final int e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f42324a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f42325b, this.f42326c, this.e, j3, obj);
    }

    public final boolean b() {
        if (this.f42325b != -1) {
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
        if (this.f42324a.equals(g0Var.f42324a) && this.f42325b == g0Var.f42325b && this.f42326c == g0Var.f42326c && this.d == g0Var.d && this.e == g0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f42324a.hashCode() + 527) * 31) + this.f42325b) * 31) + this.f42326c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public g0(int i10, int i11, int i12, long j3, Object obj) {
        this.f42324a = obj;
        this.f42325b = i10;
        this.f42326c = i11;
        this.d = j3;
        this.e = i12;
    }
}
