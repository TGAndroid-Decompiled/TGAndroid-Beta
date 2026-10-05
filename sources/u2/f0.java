package u2;
public final class f0 {
    public final Object f47270a;
    public final int f47271b;
    public final int f47272c;
    public final long d;
    public final int f47273e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f47270a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f47271b, this.f47272c, this.f47273e, j3, obj);
    }

    public final boolean b() {
        if (this.f47271b != -1) {
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
        if (this.f47270a.equals(f0Var.f47270a) && this.f47271b == f0Var.f47271b && this.f47272c == f0Var.f47272c && this.d == f0Var.d && this.f47273e == f0Var.f47273e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f47270a.hashCode() + 527) * 31) + this.f47271b) * 31) + this.f47272c) * 31) + ((int) this.d)) * 31) + this.f47273e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f47270a = obj;
        this.f47271b = i10;
        this.f47272c = i11;
        this.d = j3;
        this.f47273e = i12;
    }
}
