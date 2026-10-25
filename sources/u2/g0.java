package u2;
public final class g0 {
    public final Object f49294a;
    public final int f49295b;
    public final int f49296c;
    public final long d;
    public final int e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f49294a.equals(obj)) {
            return this;
        }
        long j10 = this.d;
        return new g0(this.f49295b, this.f49296c, this.e, j10, obj);
    }

    public final boolean b() {
        if (this.f49295b != -1) {
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
        if (this.f49294a.equals(g0Var.f49294a) && this.f49295b == g0Var.f49295b && this.f49296c == g0Var.f49296c && this.d == g0Var.d && this.e == g0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f49294a.hashCode() + 527) * 31) + this.f49295b) * 31) + this.f49296c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public g0(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public g0(Object obj, long j10, int i10) {
        this(-1, -1, i10, j10, obj);
    }

    public g0(int i10, int i11, int i12, long j10, Object obj) {
        this.f49294a = obj;
        this.f49295b = i10;
        this.f49296c = i11;
        this.d = j10;
        this.e = i12;
    }
}
