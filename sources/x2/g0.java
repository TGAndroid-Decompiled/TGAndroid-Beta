package x2;
public final class g0 {
    public final Object f60129a;
    public final int f60130b;
    public final int f60131c;
    public final long d;
    public final int f60132e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f60129a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f60130b, this.f60131c, this.f60132e, j3, obj);
    }

    public final boolean b() {
        if (this.f60130b != -1) {
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
        if (this.f60129a.equals(g0Var.f60129a) && this.f60130b == g0Var.f60130b && this.f60131c == g0Var.f60131c && this.d == g0Var.d && this.f60132e == g0Var.f60132e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f60129a.hashCode() + 527) * 31) + this.f60130b) * 31) + this.f60131c) * 31) + ((int) this.d)) * 31) + this.f60132e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public g0(int i7, int i10, int i11, long j3, Object obj) {
        this.f60129a = obj;
        this.f60130b = i7;
        this.f60131c = i10;
        this.d = j3;
        this.f60132e = i11;
    }
}
