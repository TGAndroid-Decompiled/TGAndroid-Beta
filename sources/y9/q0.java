package y9;
public final class q0 extends p1 {
    public final String f46996a;
    public final String f46997b;
    public final long f46998c;

    public q0(long j3, String str, String str2) {
        this.f46996a = str;
        this.f46997b = str2;
        this.f46998c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46996a.equals(q0Var.f46996a) && this.f46997b.equals(q0Var.f46997b) && this.f46998c == q0Var.f46998c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46998c;
        return ((((this.f46996a.hashCode() ^ 1000003) * 1000003) ^ this.f46997b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46996a);
        sb2.append(", code=");
        sb2.append(this.f46997b);
        sb2.append(", address=");
        return a4.a.s(sb2, this.f46998c, "}");
    }
}
