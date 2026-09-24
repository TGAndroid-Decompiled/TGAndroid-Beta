package y9;
public final class q0 extends p1 {
    public final String f46877a;
    public final String f46878b;
    public final long f46879c;

    public q0(long j3, String str, String str2) {
        this.f46877a = str;
        this.f46878b = str2;
        this.f46879c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46877a.equals(q0Var.f46877a) && this.f46878b.equals(q0Var.f46878b) && this.f46879c == q0Var.f46879c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46879c;
        return ((((this.f46877a.hashCode() ^ 1000003) * 1000003) ^ this.f46878b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46877a);
        sb2.append(", code=");
        sb2.append(this.f46878b);
        sb2.append(", address=");
        return a4.a.s(sb2, this.f46879c, "}");
    }
}
