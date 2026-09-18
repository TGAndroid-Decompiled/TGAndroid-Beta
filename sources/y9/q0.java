package y9;
public final class q0 extends p1 {
    public final String f46864a;
    public final String f46865b;
    public final long f46866c;

    public q0(long j3, String str, String str2) {
        this.f46864a = str;
        this.f46865b = str2;
        this.f46866c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46864a.equals(q0Var.f46864a) && this.f46865b.equals(q0Var.f46865b) && this.f46866c == q0Var.f46866c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46866c;
        return ((((this.f46864a.hashCode() ^ 1000003) * 1000003) ^ this.f46865b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46864a);
        sb2.append(", code=");
        sb2.append(this.f46865b);
        sb2.append(", address=");
        return a4.a.r(sb2, this.f46866c, "}");
    }
}
