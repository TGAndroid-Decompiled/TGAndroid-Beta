package x2;
public final class g0 {
    public final Object f58240a;
    public final int f58241b;
    public final int f58242c;
    public final long d;
    public final int f58243e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f58240a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f58241b, this.f58242c, this.f58243e, j3, obj);
    }

    public final boolean b() {
        if (this.f58241b != -1) {
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
        if (this.f58240a.equals(g0Var.f58240a) && this.f58241b == g0Var.f58241b && this.f58242c == g0Var.f58242c && this.d == g0Var.d && this.f58243e == g0Var.f58243e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f58240a.hashCode() + 527) * 31) + this.f58241b) * 31) + this.f58242c) * 31) + ((int) this.d)) * 31) + this.f58243e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public g0(int i7, int i10, int i11, long j3, Object obj) {
        this.f58240a = obj;
        this.f58241b = i7;
        this.f58242c = i10;
        this.d = j3;
        this.f58243e = i11;
    }
}
