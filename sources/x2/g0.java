package x2;
public final class g0 {
    public final Object f58329a;
    public final int f58330b;
    public final int f58331c;
    public final long d;
    public final int f58332e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f58329a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f58330b, this.f58331c, this.f58332e, j3, obj);
    }

    public final boolean b() {
        if (this.f58330b != -1) {
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
        if (this.f58329a.equals(g0Var.f58329a) && this.f58330b == g0Var.f58330b && this.f58331c == g0Var.f58331c && this.d == g0Var.d && this.f58332e == g0Var.f58332e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f58329a.hashCode() + 527) * 31) + this.f58330b) * 31) + this.f58331c) * 31) + ((int) this.d)) * 31) + this.f58332e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public g0(int i7, int i10, int i11, long j3, Object obj) {
        this.f58329a = obj;
        this.f58330b = i7;
        this.f58331c = i10;
        this.d = j3;
        this.f58332e = i11;
    }
}
