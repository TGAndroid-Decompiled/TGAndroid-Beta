package u2;
public final class g0 {
    public final Object f49875a;
    public final int f49876b;
    public final int f49877c;
    public final long d;
    public final int e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f49875a.equals(obj)) {
            return this;
        }
        long j10 = this.d;
        return new g0(this.f49876b, this.f49877c, this.e, j10, obj);
    }

    public final boolean b() {
        if (this.f49876b != -1) {
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
        if (this.f49875a.equals(g0Var.f49875a) && this.f49876b == g0Var.f49876b && this.f49877c == g0Var.f49877c && this.d == g0Var.d && this.e == g0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f49875a.hashCode() + 527) * 31) + this.f49876b) * 31) + this.f49877c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public g0(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public g0(Object obj, long j10, int i10) {
        this(-1, -1, i10, j10, obj);
    }

    public g0(int i10, int i11, int i12, long j10, Object obj) {
        this.f49875a = obj;
        this.f49876b = i10;
        this.f49877c = i11;
        this.d = j10;
        this.e = i12;
    }
}
