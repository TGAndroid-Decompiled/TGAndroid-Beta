package x2;
public final class g0 {
    public final Object f58235a;
    public final int f58236b;
    public final int f58237c;
    public final long d;
    public final int f58238e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f58235a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f58236b, this.f58237c, this.f58238e, j3, obj);
    }

    public final boolean b() {
        if (this.f58236b != -1) {
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
        if (this.f58235a.equals(g0Var.f58235a) && this.f58236b == g0Var.f58236b && this.f58237c == g0Var.f58237c && this.d == g0Var.d && this.f58238e == g0Var.f58238e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f58235a.hashCode() + 527) * 31) + this.f58236b) * 31) + this.f58237c) * 31) + ((int) this.d)) * 31) + this.f58238e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public g0(int i7, int i10, int i11, long j3, Object obj) {
        this.f58235a = obj;
        this.f58236b = i7;
        this.f58237c = i10;
        this.d = j3;
        this.f58238e = i11;
    }
}
