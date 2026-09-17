package u2;
public final class f0 {
    public final Object f46668a;
    public final int f46669b;
    public final int f46670c;
    public final long d;
    public final int f46671e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f46668a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f46669b, this.f46670c, this.f46671e, j3, obj);
    }

    public final boolean b() {
        if (this.f46669b != -1) {
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
        if (this.f46668a.equals(f0Var.f46668a) && this.f46669b == f0Var.f46669b && this.f46670c == f0Var.f46670c && this.d == f0Var.d && this.f46671e == f0Var.f46671e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f46668a.hashCode() + 527) * 31) + this.f46669b) * 31) + this.f46670c) * 31) + ((int) this.d)) * 31) + this.f46671e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f46668a = obj;
        this.f46669b = i10;
        this.f46670c = i11;
        this.d = j3;
        this.f46671e = i12;
    }
}
