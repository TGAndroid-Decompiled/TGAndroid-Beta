package y9;
public final class q0 extends p1 {
    public final String f50743a;
    public final String f50744b;
    public final long f50745c;

    public q0(long j3, String str, String str2) {
        this.f50743a = str;
        this.f50744b = str2;
        this.f50745c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f50743a.equals(q0Var.f50743a) && this.f50744b.equals(q0Var.f50744b) && this.f50745c == q0Var.f50745c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f50745c;
        return ((((this.f50743a.hashCode() ^ 1000003) * 1000003) ^ this.f50744b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f50743a);
        sb2.append(", code=");
        sb2.append(this.f50744b);
        sb2.append(", address=");
        return a4.a.r(sb2, this.f50745c, "}");
    }
}
