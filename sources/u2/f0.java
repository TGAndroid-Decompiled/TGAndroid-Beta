package u2;
public final class f0 {
    public final Object f48674a;
    public final int f48675b;
    public final int f48676c;
    public final long d;
    public final int f48677e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f48674a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f48675b, this.f48676c, this.f48677e, j3, obj);
    }

    public final boolean b() {
        if (this.f48675b != -1) {
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
        if (this.f48674a.equals(f0Var.f48674a) && this.f48675b == f0Var.f48675b && this.f48676c == f0Var.f48676c && this.d == f0Var.d && this.f48677e == f0Var.f48677e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f48674a.hashCode() + 527) * 31) + this.f48675b) * 31) + this.f48676c) * 31) + ((int) this.d)) * 31) + this.f48677e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f48674a = obj;
        this.f48675b = i10;
        this.f48676c = i11;
        this.d = j3;
        this.f48677e = i12;
    }
}
