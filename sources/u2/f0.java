package u2;
public final class f0 {
    public final Object f47255a;
    public final int f47256b;
    public final int f47257c;
    public final long d;
    public final int f47258e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f47255a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f47256b, this.f47257c, this.f47258e, j3, obj);
    }

    public final boolean b() {
        if (this.f47256b != -1) {
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
        if (this.f47255a.equals(f0Var.f47255a) && this.f47256b == f0Var.f47256b && this.f47257c == f0Var.f47257c && this.d == f0Var.d && this.f47258e == f0Var.f47258e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f47255a.hashCode() + 527) * 31) + this.f47256b) * 31) + this.f47257c) * 31) + ((int) this.d)) * 31) + this.f47258e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f47255a = obj;
        this.f47256b = i10;
        this.f47257c = i11;
        this.d = j3;
        this.f47258e = i12;
    }
}
