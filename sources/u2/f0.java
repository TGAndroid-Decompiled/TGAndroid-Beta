package u2;
public final class f0 {
    public final Object f43353a;
    public final int f43354b;
    public final int f43355c;
    public final long d;
    public final int e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f43353a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f43354b, this.f43355c, this.e, j3, obj);
    }

    public final boolean b() {
        if (this.f43354b != -1) {
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
        if (this.f43353a.equals(f0Var.f43353a) && this.f43354b == f0Var.f43354b && this.f43355c == f0Var.f43355c && this.d == f0Var.d && this.e == f0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f43353a.hashCode() + 527) * 31) + this.f43354b) * 31) + this.f43355c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f43353a = obj;
        this.f43354b = i10;
        this.f43355c = i11;
        this.d = j3;
        this.e = i12;
    }
}
