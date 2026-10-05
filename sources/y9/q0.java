package y9;
public final class q0 extends p1 {
    public final String f50759a;
    public final String f50760b;
    public final long f50761c;

    public q0(long j3, String str, String str2) {
        this.f50759a = str;
        this.f50760b = str2;
        this.f50761c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f50759a.equals(q0Var.f50759a) && this.f50760b.equals(q0Var.f50760b) && this.f50761c == q0Var.f50761c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f50761c;
        return ((((this.f50759a.hashCode() ^ 1000003) * 1000003) ^ this.f50760b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f50759a);
        sb2.append(", code=");
        sb2.append(this.f50760b);
        sb2.append(", address=");
        return a4.a.s(sb2, this.f50761c, "}");
    }
}
