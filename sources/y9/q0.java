package y9;
public final class q0 extends p1 {
    public final String f50752a;
    public final String f50753b;
    public final long f50754c;

    public q0(long j3, String str, String str2) {
        this.f50752a = str;
        this.f50753b = str2;
        this.f50754c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f50752a.equals(q0Var.f50752a) && this.f50753b.equals(q0Var.f50753b) && this.f50754c == q0Var.f50754c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f50754c;
        return ((((this.f50752a.hashCode() ^ 1000003) * 1000003) ^ this.f50753b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f50752a);
        sb2.append(", code=");
        sb2.append(this.f50753b);
        sb2.append(", address=");
        return a4.a.s(sb2, this.f50754c, "}");
    }
}
