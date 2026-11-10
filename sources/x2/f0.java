package x2;
public final class f0 {
    public final Object f58342a;
    public final int f58343b;
    public final int f58344c;
    public final long d;
    public final int f58345e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f58342a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f58343b, this.f58344c, this.f58345e, j3, obj);
    }

    public final boolean b() {
        if (this.f58343b != -1) {
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
        if (this.f58342a.equals(f0Var.f58342a) && this.f58343b == f0Var.f58343b && this.f58344c == f0Var.f58344c && this.d == f0Var.d && this.f58345e == f0Var.f58345e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f58342a.hashCode() + 527) * 31) + this.f58343b) * 31) + this.f58344c) * 31) + ((int) this.d)) * 31) + this.f58345e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i7) {
        this(-1, -1, i7, j3, obj);
    }

    public f0(int i7, int i10, int i11, long j3, Object obj) {
        this.f58342a = obj;
        this.f58343b = i7;
        this.f58344c = i10;
        this.d = j3;
        this.f58345e = i11;
    }
}
