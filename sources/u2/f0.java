package u2;
public final class f0 {
    public final Object f47263a;
    public final int f47264b;
    public final int f47265c;
    public final long d;
    public final int f47266e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f47263a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f47264b, this.f47265c, this.f47266e, j3, obj);
    }

    public final boolean b() {
        if (this.f47264b != -1) {
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
        if (this.f47263a.equals(f0Var.f47263a) && this.f47264b == f0Var.f47264b && this.f47265c == f0Var.f47265c && this.d == f0Var.d && this.f47266e == f0Var.f47266e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f47263a.hashCode() + 527) * 31) + this.f47264b) * 31) + this.f47265c) * 31) + ((int) this.d)) * 31) + this.f47266e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f47263a = obj;
        this.f47264b = i10;
        this.f47265c = i11;
        this.d = j3;
        this.f47266e = i12;
    }
}
