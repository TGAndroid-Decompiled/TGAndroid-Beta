package u2;
public final class f0 {
    public final Object f46695a;
    public final int f46696b;
    public final int f46697c;
    public final long d;
    public final int f46698e;

    public f0(Object obj) {
        this(obj, -1L);
    }

    public final f0 a(Object obj) {
        if (this.f46695a.equals(obj)) {
            return this;
        }
        long j3 = this.d;
        return new f0(this.f46696b, this.f46697c, this.f46698e, j3, obj);
    }

    public final boolean b() {
        if (this.f46696b != -1) {
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
        if (this.f46695a.equals(f0Var.f46695a) && this.f46696b == f0Var.f46696b && this.f46697c == f0Var.f46697c && this.d == f0Var.d && this.f46698e == f0Var.f46698e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f46695a.hashCode() + 527) * 31) + this.f46696b) * 31) + this.f46697c) * 31) + ((int) this.d)) * 31) + this.f46698e;
    }

    public f0(Object obj, long j3) {
        this(-1, -1, -1, j3, obj);
    }

    public f0(Object obj, long j3, int i10) {
        this(-1, -1, i10, j3, obj);
    }

    public f0(int i10, int i11, int i12, long j3, Object obj) {
        this.f46695a = obj;
        this.f46696b = i10;
        this.f46697c = i11;
        this.d = j3;
        this.f46698e = i12;
    }
}
