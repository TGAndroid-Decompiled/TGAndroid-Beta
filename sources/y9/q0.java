package y9;
public final class q0 extends p1 {
    public final String f52272a;
    public final String f52273b;
    public final long f52274c;

    public q0(long j3, String str, String str2) {
        this.f52272a = str;
        this.f52273b = str2;
        this.f52274c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f52272a.equals(q0Var.f52272a) && this.f52273b.equals(q0Var.f52273b) && this.f52274c == q0Var.f52274c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f52274c;
        return ((((this.f52272a.hashCode() ^ 1000003) * 1000003) ^ this.f52273b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f52272a);
        sb2.append(", code=");
        sb2.append(this.f52273b);
        sb2.append(", address=");
        return a1.g.s(sb2, this.f52274c, "}");
    }
}
