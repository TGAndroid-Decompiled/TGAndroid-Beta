package y9;
public final class q0 extends p1 {
    public final String f49891a;
    public final String f49892b;
    public final long f49893c;

    public q0(long j3, String str, String str2) {
        this.f49891a = str;
        this.f49892b = str2;
        this.f49893c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f49891a.equals(q0Var.f49891a) && this.f49892b.equals(q0Var.f49892b) && this.f49893c == q0Var.f49893c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f49893c;
        return ((((this.f49891a.hashCode() ^ 1000003) * 1000003) ^ this.f49892b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f49891a);
        sb2.append(", code=");
        sb2.append(this.f49892b);
        sb2.append(", address=");
        return a4.a.r(sb2, this.f49893c, "}");
    }
}
