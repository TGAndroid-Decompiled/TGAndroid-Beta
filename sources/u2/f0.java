package u2;
public final class f0 {
    public final Object f48572a;
    public final int f48573b;
    public final int f48574c;
    public final long d;
    public final int f48575e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f48572a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f48573b, this.f48574c, this.f48575e, j3, obj);
    }

    public final boolean b() {
        if (this.f48573b != -1) {
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
        if (this.f48572a.equals(f0Var.f48572a) && this.f48573b == f0Var.f48573b && this.f48574c == f0Var.f48574c && this.d == f0Var.d && this.f48575e == f0Var.f48575e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f48572a.hashCode() + 527) * 31) + this.f48573b) * 31) + this.f48574c) * 31) + ((int) this.d)) * 31) + this.f48575e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f48572a = obj;
        this.f48573b = i10;
        this.f48574c = i11;
        this.d = j3;
        this.f48575e = i12;
    }
}
