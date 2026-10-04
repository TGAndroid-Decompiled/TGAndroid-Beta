package u2;
public final class f0 {
    public final Object f47254a;
    public final int f47255b;
    public final int f47256c;
    public final long d;
    public final int f47257e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f47254a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f47255b, this.f47256c, this.f47257e, j3, obj);
    }

    public final boolean b() {
        if (this.f47255b != -1) {
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
        if (this.f47254a.equals(f0Var.f47254a) && this.f47255b == f0Var.f47255b && this.f47256c == f0Var.f47256c && this.d == f0Var.d && this.f47257e == f0Var.f47257e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f47254a.hashCode() + 527) * 31) + this.f47255b) * 31) + this.f47256c) * 31) + ((int) this.d)) * 31) + this.f47257e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f47254a = obj;
        this.f47255b = i10;
        this.f47256c = i11;
        this.d = j3;
        this.f47257e = i12;
    }
}
