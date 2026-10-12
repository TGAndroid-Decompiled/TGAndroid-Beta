package y9;
public final class q0 extends p1 {
    public final String f52264a;
    public final String f52265b;
    public final long f52266c;

    public q0(long j3, String str, String str2) {
        this.f52264a = str;
        this.f52265b = str2;
        this.f52266c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f52264a.equals(q0Var.f52264a) && this.f52265b.equals(q0Var.f52265b) && this.f52266c == q0Var.f52266c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f52266c;
        return ((((this.f52264a.hashCode() ^ 1000003) * 1000003) ^ this.f52265b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f52264a);
        sb2.append(", code=");
        sb2.append(this.f52265b);
        sb2.append(", address=");
        return a1.g.s(sb2, this.f52266c, "}");
    }
}
