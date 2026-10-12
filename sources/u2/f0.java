package u2;
public final class f0 {
    public final Object f48789a;
    public final int f48790b;
    public final int f48791c;
    public final long d;
    public final int f48792e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f48789a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f48790b, this.f48791c, this.f48792e, j3, obj);
    }

    public final boolean b() {
        if (this.f48790b != -1) {
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
        if (this.f48789a.equals(f0Var.f48789a) && this.f48790b == f0Var.f48790b && this.f48791c == f0Var.f48791c && this.d == f0Var.d && this.f48792e == f0Var.f48792e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f48789a.hashCode() + 527) * 31) + this.f48790b) * 31) + this.f48791c) * 31) + ((int) this.d)) * 31) + this.f48792e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f48789a = obj;
        this.f48790b = i10;
        this.f48791c = i11;
        this.d = j3;
        this.f48792e = i12;
    }
}
