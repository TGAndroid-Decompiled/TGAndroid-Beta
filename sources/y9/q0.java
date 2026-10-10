package y9;
public final class q0 extends p1 {
    public final String f52084a;
    public final String f52085b;
    public final long f52086c;

    public q0(long j3, String str, String str2) {
        this.f52084a = str;
        this.f52085b = str2;
        this.f52086c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f52084a.equals(q0Var.f52084a) && this.f52085b.equals(q0Var.f52085b) && this.f52086c == q0Var.f52086c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f52086c;
        return ((((this.f52084a.hashCode() ^ 1000003) * 1000003) ^ this.f52085b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f52084a);
        sb2.append(", code=");
        sb2.append(this.f52085b);
        sb2.append(", address=");
        return a1.g.s(sb2, this.f52086c, "}");
    }
}
