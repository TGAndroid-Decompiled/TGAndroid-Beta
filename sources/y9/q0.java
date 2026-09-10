package y9;
public final class q0 extends p1 {
    public final String f46759a;
    public final String f46760b;
    public final long f46761c;

    public q0(long j3, String str, String str2) {
        this.f46759a = str;
        this.f46760b = str2;
        this.f46761c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46759a.equals(q0Var.f46759a) && this.f46760b.equals(q0Var.f46760b) && this.f46761c == q0Var.f46761c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46761c;
        return ((((this.f46759a.hashCode() ^ 1000003) * 1000003) ^ this.f46760b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46759a);
        sb2.append(", code=");
        sb2.append(this.f46760b);
        sb2.append(", address=");
        return a4.a.r(sb2, this.f46761c, "}");
    }
}
