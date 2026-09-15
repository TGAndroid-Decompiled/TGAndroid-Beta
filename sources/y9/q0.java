package y9;
public final class q0 extends p1 {
    public final String f46609a;
    public final String f46610b;
    public final long f46611c;

    public q0(long j3, String str, String str2) {
        this.f46609a = str;
        this.f46610b = str2;
        this.f46611c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46609a.equals(q0Var.f46609a) && this.f46610b.equals(q0Var.f46610b) && this.f46611c == q0Var.f46611c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46611c;
        return ((((this.f46609a.hashCode() ^ 1000003) * 1000003) ^ this.f46610b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46609a);
        sb2.append(", code=");
        sb2.append(this.f46610b);
        sb2.append(", address=");
        return a4.a.r(sb2, this.f46611c, "}");
    }
}
