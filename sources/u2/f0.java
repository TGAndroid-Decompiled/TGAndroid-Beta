package u2;
public final class f0 {
    public final Object f46667a;
    public final int f46668b;
    public final int f46669c;
    public final long d;
    public final int f46670e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f46667a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f46668b, this.f46669c, this.f46670e, j3, obj);
    }

    public final boolean b() {
        if (this.f46668b != -1) {
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
        if (this.f46667a.equals(f0Var.f46667a) && this.f46668b == f0Var.f46668b && this.f46669c == f0Var.f46669c && this.d == f0Var.d && this.f46670e == f0Var.f46670e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f46667a.hashCode() + 527) * 31) + this.f46668b) * 31) + this.f46669c) * 31) + ((int) this.d)) * 31) + this.f46670e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f46667a = obj;
        this.f46668b = i10;
        this.f46669c = i11;
        this.d = j3;
        this.f46670e = i12;
    }
}
