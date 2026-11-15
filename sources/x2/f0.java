package x2;
public final class f0 {
    public final Object f59523a;
    public final int f59524b;
    public final int f59525c;
    public final long d;
    public final int f59526e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f59523a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f59524b, this.f59525c, this.f59526e, j3, obj);
    }

    public final boolean b() {
        if (this.f59524b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f59523a.equals(f0Var.f59523a) && this.f59524b == f0Var.f59524b && this.f59525c == f0Var.f59525c && this.d == f0Var.d && this.f59526e == f0Var.f59526e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f59523a.hashCode() + 527) * 31) + this.f59524b) * 31) + this.f59525c) * 31) + ((int) this.d)) * 31) + this.f59526e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public f0(int i7, int i10, int i11, long j3, Object obj) {
        this.f59523a = obj;
        this.f59524b = i7;
        this.f59525c = i10;
        this.d = j3;
        this.f59526e = i11;
    }
}
