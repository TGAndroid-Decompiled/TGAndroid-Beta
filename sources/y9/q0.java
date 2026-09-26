package y9;
public final class q0 extends p1 {
    public final String f46887a;
    public final String f46888b;
    public final long f46889c;

    public q0(long j3, String str, String str2) {
        this.f46887a = str;
        this.f46888b = str2;
        this.f46889c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46887a.equals(q0Var.f46887a) && this.f46888b.equals(q0Var.f46888b) && this.f46889c == q0Var.f46889c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46889c;
        return ((((this.f46887a.hashCode() ^ 1000003) * 1000003) ^ this.f46888b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46887a);
        sb2.append(", code=");
        sb2.append(this.f46888b);
        sb2.append(", address=");
        return a4.a.s(sb2, this.f46889c, "}");
    }
}
