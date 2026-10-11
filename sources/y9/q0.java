package y9;
public final class q0 extends p1 {
    public final String f52161a;
    public final String f52162b;
    public final long f52163c;

    public q0(long j3, String str, String str2) {
        this.f52161a = str;
        this.f52162b = str2;
        this.f52163c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f52161a.equals(q0Var.f52161a) && this.f52162b.equals(q0Var.f52162b) && this.f52163c == q0Var.f52163c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f52163c;
        return ((((this.f52161a.hashCode() ^ 1000003) * 1000003) ^ this.f52162b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f52161a);
        sb2.append(", code=");
        sb2.append(this.f52162b);
        sb2.append(", address=");
        return a1.g.s(sb2, this.f52163c, "}");
    }
}
