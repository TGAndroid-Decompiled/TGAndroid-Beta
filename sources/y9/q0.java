package y9;
public final class q0 extends p1 {
    public final String f52040a;
    public final String f52041b;
    public final long f52042c;

    public q0(long j3, String str, String str2) {
        this.f52040a = str;
        this.f52041b = str2;
        this.f52042c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f52040a.equals(q0Var.f52040a) && this.f52041b.equals(q0Var.f52041b) && this.f52042c == q0Var.f52042c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f52042c;
        return ((((this.f52040a.hashCode() ^ 1000003) * 1000003) ^ this.f52041b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f52040a);
        sb2.append(", code=");
        sb2.append(this.f52041b);
        sb2.append(", address=");
        return a1.g.s(sb2, this.f52042c, "}");
    }
}
