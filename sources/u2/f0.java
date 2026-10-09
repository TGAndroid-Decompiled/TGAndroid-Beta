package u2;
public final class f0 {
    public final Object f48570a;
    public final int f48571b;
    public final int f48572c;
    public final long d;
    public final int f48573e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f48570a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f48571b, this.f48572c, this.f48573e, j3, obj);
    }

    public final boolean b() {
        if (this.f48571b != -1) {
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
        if (this.f48570a.equals(f0Var.f48570a) && this.f48571b == f0Var.f48571b && this.f48572c == f0Var.f48572c && this.d == f0Var.d && this.f48573e == f0Var.f48573e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f48570a.hashCode() + 527) * 31) + this.f48571b) * 31) + this.f48572c) * 31) + ((int) this.d)) * 31) + this.f48573e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f48570a = obj;
        this.f48571b = i10;
        this.f48572c = i11;
        this.d = j3;
        this.f48573e = i12;
    }
}
