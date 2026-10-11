package u2;
public final class f0 {
    public final Object f48640a;
    public final int f48641b;
    public final int f48642c;
    public final long d;
    public final int f48643e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f48640a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f48641b, this.f48642c, this.f48643e, j3, obj);
    }

    public final boolean b() {
        if (this.f48641b != -1) {
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
        if (this.f48640a.equals(f0Var.f48640a) && this.f48641b == f0Var.f48641b && this.f48642c == f0Var.f48642c && this.d == f0Var.d && this.f48643e == f0Var.f48643e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f48640a.hashCode() + 527) * 31) + this.f48641b) * 31) + this.f48642c) * 31) + ((int) this.d)) * 31) + this.f48643e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f48640a = obj;
        this.f48641b = i10;
        this.f48642c = i11;
        this.d = j3;
        this.f48643e = i12;
    }
}
