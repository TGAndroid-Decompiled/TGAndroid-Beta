package x2;
public final class g0 {
    public final Object f60133a;
    public final int f60134b;
    public final int f60135c;
    public final long d;
    public final int f60136e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f60133a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f60134b, this.f60135c, this.f60136e, j3, obj);
    }

    public final boolean b() {
        if (this.f60134b != -1) {
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
        if (this.f60133a.equals(g0Var.f60133a) && this.f60134b == g0Var.f60134b && this.f60135c == g0Var.f60135c && this.d == g0Var.d && this.f60136e == g0Var.f60136e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f60133a.hashCode() + 527) * 31) + this.f60134b) * 31) + this.f60135c) * 31) + ((int) this.d)) * 31) + this.f60136e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public g0(int i7, int i10, int i11, long j3, Object obj) {
        this.f60133a = obj;
        this.f60134b = i7;
        this.f60135c = i10;
        this.d = j3;
        this.f60136e = i11;
    }
}
