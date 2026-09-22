package y9;
public final class q0 extends p1 {
    public final String f46605a;
    public final String f46606b;
    public final long f46607c;

    public q0(long j3, String str, String str2) {
        this.f46605a = str;
        this.f46606b = str2;
        this.f46607c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46605a.equals(q0Var.f46605a) && this.f46606b.equals(q0Var.f46606b) && this.f46607c == q0Var.f46607c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46607c;
        return ((((this.f46605a.hashCode() ^ 1000003) * 1000003) ^ this.f46606b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46605a);
        sb2.append(", code=");
        sb2.append(this.f46606b);
        sb2.append(", address=");
        return a4.a.s(sb2, this.f46607c, "}");
    }
}
