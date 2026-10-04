package y9;
public final class q0 extends p1 {
    public final String f50744a;
    public final String f50745b;
    public final long f50746c;

    public q0(long j3, String str, String str2) {
        this.f50744a = str;
        this.f50745b = str2;
        this.f50746c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f50744a.equals(q0Var.f50744a) && this.f50745b.equals(q0Var.f50745b) && this.f50746c == q0Var.f50746c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f50746c;
        return ((((this.f50744a.hashCode() ^ 1000003) * 1000003) ^ this.f50745b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f50744a);
        sb2.append(", code=");
        sb2.append(this.f50745b);
        sb2.append(", address=");
        return a4.a.r(sb2, this.f50746c, "}");
    }
}
