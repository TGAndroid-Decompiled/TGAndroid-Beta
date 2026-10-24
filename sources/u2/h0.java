package u2;
public final class h0 {
    public final Object f47766a;
    public final int f47767b;
    public final int f47768c;
    public final long d;
    public final int e;

    public h0(Object obj) {
        this(obj, -1L);
    }

    public final h0 a(Object obj) {
        if (this.f47766a.equals(obj)) {
            return this;
        }
        long j10 = this.d;
        return new h0(this.f47767b, this.f47768c, this.e, j10, obj);
    }

    public final boolean b() {
        if (this.f47767b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f47766a.equals(h0Var.f47766a) && this.f47767b == h0Var.f47767b && this.f47768c == h0Var.f47768c && this.d == h0Var.d && this.e == h0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f47766a.hashCode() + 527) * 31) + this.f47767b) * 31) + this.f47768c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public h0(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public h0(Object obj, long j10, int i10) {
        this(-1, -1, i10, j10, obj);
    }

    public h0(int i10, int i11, int i12, long j10, Object obj) {
        this.f47766a = obj;
        this.f47767b = i10;
        this.f47768c = i11;
        this.d = j10;
        this.e = i12;
    }
}
