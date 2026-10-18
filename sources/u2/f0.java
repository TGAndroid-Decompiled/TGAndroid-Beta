package u2;
public final class f0 {
    public final Object f47347a;
    public final int f47348b;
    public final int f47349c;
    public final long d;
    public final int e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f47347a.equals(obj)) {
            return this;
        }
        long j10 = this.d;
        return new f0(this.f47348b, this.f47349c, this.e, j10, obj);
    }

    public final boolean b() {
        if (this.f47348b != -1) {
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
        if (this.f47347a.equals(f0Var.f47347a) && this.f47348b == f0Var.f47348b && this.f47349c == f0Var.f47349c && this.d == f0Var.d && this.e == f0Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f47347a.hashCode() + 527) * 31) + this.f47348b) * 31) + this.f47349c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public f0(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public f0(Object obj, long j10, int i10) {
        this(-1, -1, i10, j10, obj);
    }

    public f0(int i10, int i11, int i12, long j10, Object obj) {
        this.f47347a = obj;
        this.f47348b = i10;
        this.f47349c = i11;
        this.d = j10;
        this.e = i12;
    }
}
