package u2;
public final class f0 {
    public final Object f48781a;
    public final int f48782b;
    public final int f48783c;
    public final long d;
    public final int f48784e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f48781a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f48782b, this.f48783c, this.f48784e, j3, obj);
    }

    public final boolean b() {
        if (this.f48782b != -1) {
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
        if (this.f48781a.equals(f0Var.f48781a) && this.f48782b == f0Var.f48782b && this.f48783c == f0Var.f48783c && this.d == f0Var.d && this.f48784e == f0Var.f48784e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f48781a.hashCode() + 527) * 31) + this.f48782b) * 31) + this.f48783c) * 31) + ((int) this.d)) * 31) + this.f48784e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f48781a = obj;
        this.f48782b = i10;
        this.f48783c = i11;
        this.d = j3;
        this.f48784e = i12;
    }
}
