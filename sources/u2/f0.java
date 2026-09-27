package u2;
public final class f0 {
    public final Object f43687a;
    public final int f43688b;
    public final int f43689c;
    public final long d;
    public final int e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f43687a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f43688b, this.f43689c, this.e, j3, obj);
    }

    public final boolean b() {
        if (this.f43688b != -1) {
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
        if (this.f43687a.equals(f0Var.f43687a) && this.f43688b == f0Var.f43688b && this.f43689c == f0Var.f43689c && this.d == f0Var.d && this.e == f0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f43687a.hashCode() + 527) * 31) + this.f43688b) * 31) + this.f43689c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f43687a = obj;
        this.f43688b = i10;
        this.f43689c = i11;
        this.d = j3;
        this.e = i12;
    }
}
