package x2;
public final class g0 {
    public final Object f58234a;
    public final int f58235b;
    public final int f58236c;
    public final long d;
    public final int f58237e;

    public g0(Object obj) {
        this(obj, -1L);
    }

    public final g0 a(Object obj) {
        if (this.f58234a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new g0(this.f58235b, this.f58236c, this.f58237e, j3, obj);
    }

    public final boolean b() {
        if (this.f58235b != -1) {
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
        if (this.f58234a.equals(g0Var.f58234a) && this.f58235b == g0Var.f58235b && this.f58236c == g0Var.f58236c && this.d == g0Var.d && this.f58237e == g0Var.f58237e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f58234a.hashCode() + 527) * 31) + this.f58235b) * 31) + this.f58236c) * 31) + ((int) this.d)) * 31) + this.f58237e;
    }

    public g0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public g0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public g0(int i7, int i10, int i11, long j3, Object obj) {
        this.f58234a = obj;
        this.f58235b = i7;
        this.f58236c = i10;
        this.d = j3;
        this.f58237e = i11;
    }
}
