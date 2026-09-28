package y9;
public final class q0 extends p1 {
    public final String f46888a;
    public final String f46889b;
    public final long f46890c;

    public q0(long j3, String str, String str2) {
        this.f46888a = str;
        this.f46889b = str2;
        this.f46890c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46888a.equals(q0Var.f46888a) && this.f46889b.equals(q0Var.f46889b) && this.f46890c == q0Var.f46890c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46890c;
        return ((((this.f46888a.hashCode() ^ 1000003) * 1000003) ^ this.f46889b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46888a);
        sb2.append(", code=");
        sb2.append(this.f46889b);
        sb2.append(", address=");
        return a4.a.s(sb2, this.f46890c, "}");
    }
}
