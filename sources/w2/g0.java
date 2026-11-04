package w2;
public final class g0 {
    public final Object f57081a;
    public final int f57082b;
    public final int f57083c;
    public final long d;
    public final int f57084e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f57081a.equals(obj)) {
            return this;
        }
        long j10 = this.d;
        return new g0(this.f57082b, this.f57083c, this.f57084e, j10, obj);
    }

    public final boolean b() {
        if (this.f57082b != -1) {
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
        if (this.f57081a.equals(g0Var.f57081a) && this.f57082b == g0Var.f57082b && this.f57083c == g0Var.f57083c && this.d == g0Var.d && this.f57084e == g0Var.f57084e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f57081a.hashCode() + 527) * 31) + this.f57082b) * 31) + this.f57083c) * 31) + ((int) this.d)) * 31) + this.f57084e;
    }

    public g0(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public g0(Object obj, long j10, int i3) {
        this(-1, -1, i3, j10, obj);
    }

    public g0(int i3, int i10, int i11, long j10, Object obj) {
        this.f57081a = obj;
        this.f57082b = i3;
        this.f57083c = i10;
        this.d = j10;
        this.f57084e = i11;
    }
}
