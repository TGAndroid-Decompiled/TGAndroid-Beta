package y9;
public final class q0 extends p1 {
    public final String f52127a;
    public final String f52128b;
    public final long f52129c;

    public q0(long j3, String str, String str2) {
        this.f52127a = str;
        this.f52128b = str2;
        this.f52129c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f52127a.equals(q0Var.f52127a) && this.f52128b.equals(q0Var.f52128b) && this.f52129c == q0Var.f52129c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f52129c;
        return ((((this.f52127a.hashCode() ^ 1000003) * 1000003) ^ this.f52128b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f52127a);
        sb2.append(", code=");
        sb2.append(this.f52128b);
        sb2.append(", address=");
        return a1.g.s(sb2, this.f52129c, "}");
    }
}
