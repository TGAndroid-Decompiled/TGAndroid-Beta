package x2;
public final class g0 {
    public final Object f58330a;
    public final int f58331b;
    public final int f58332c;
    public final long d;
    public final int f58333e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f58330a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f58331b, this.f58332c, this.f58333e, j3, obj);
    }

    public final boolean b() {
        if (this.f58331b != -1) {
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
        if (this.f58330a.equals(g0Var.f58330a) && this.f58331b == g0Var.f58331b && this.f58332c == g0Var.f58332c && this.d == g0Var.d && this.f58333e == g0Var.f58333e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f58330a.hashCode() + 527) * 31) + this.f58331b) * 31) + this.f58332c) * 31) + ((int) this.d)) * 31) + this.f58333e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public g0(int i7, int i10, int i11, long j3, Object obj) {
        this.f58330a = obj;
        this.f58331b = i7;
        this.f58332c = i10;
        this.d = j3;
        this.f58333e = i11;
    }
}
