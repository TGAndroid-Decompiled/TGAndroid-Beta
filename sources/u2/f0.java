package u2;
public final class f0 {
    public final Object f48616a;
    public final int f48617b;
    public final int f48618c;
    public final long d;
    public final int f48619e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f48616a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f48617b, this.f48618c, this.f48619e, j3, obj);
    }

    public final boolean b() {
        if (this.f48617b != -1) {
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
        if (this.f48616a.equals(f0Var.f48616a) && this.f48617b == f0Var.f48617b && this.f48618c == f0Var.f48618c && this.d == f0Var.d && this.f48619e == f0Var.f48619e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f48616a.hashCode() + 527) * 31) + this.f48617b) * 31) + this.f48618c) * 31) + ((int) this.d)) * 31) + this.f48619e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f48616a = obj;
        this.f48617b = i10;
        this.f48618c = i11;
        this.d = j3;
        this.f48619e = i12;
    }
}
