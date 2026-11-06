package x2;
public final class g0 {
    public final Object f58210a;
    public final int f58211b;
    public final int f58212c;
    public final long d;
    public final int f58213e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f58210a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f58211b, this.f58212c, this.f58213e, j3, obj);
    }

    public final boolean b() {
        if (this.f58211b != -1) {
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
        if (this.f58210a.equals(g0Var.f58210a) && this.f58211b == g0Var.f58211b && this.f58212c == g0Var.f58212c && this.d == g0Var.d && this.f58213e == g0Var.f58213e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f58210a.hashCode() + 527) * 31) + this.f58211b) * 31) + this.f58212c) * 31) + ((int) this.d)) * 31) + this.f58213e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public g0(int i7, int i10, int i11, long j3, Object obj) {
        this.f58210a = obj;
        this.f58211b = i7;
        this.f58212c = i10;
        this.d = j3;
        this.f58213e = i11;
    }
}
