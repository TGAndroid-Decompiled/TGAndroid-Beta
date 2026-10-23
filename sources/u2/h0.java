package u2;
public final class h0 {
    public final Object f47767a;
    public final int f47768b;
    public final int f47769c;
    public final long d;
    public final int e;

    public h0(Object obj) {
        this(obj, -1L);
    }

    public final h0 a(Object obj) {
        if (this.f47767a.equals(obj)) {
            return this;
        }
        long j10 = this.d;
        return new h0(this.f47768b, this.f47769c, this.e, j10, obj);
    }

    public final boolean b() {
        if (this.f47768b != -1) {
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
        if (this.f47767a.equals(h0Var.f47767a) && this.f47768b == h0Var.f47768b && this.f47769c == h0Var.f47769c && this.d == h0Var.d && this.e == h0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f47767a.hashCode() + 527) * 31) + this.f47768b) * 31) + this.f47769c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public h0(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public h0(Object obj, long j10, int i10) {
        this(-1, -1, i10, j10, obj);
    }

    public h0(int i10, int i11, int i12, long j10, Object obj) {
        this.f47767a = obj;
        this.f47768b = i10;
        this.f47769c = i11;
        this.d = j10;
        this.e = i12;
    }
}
