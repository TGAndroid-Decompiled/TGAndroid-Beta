package y9;
public final class q0 extends p1 {
    public final String f49892a;
    public final String f49893b;
    public final long f49894c;

    public q0(long j3, String str, String str2) {
        this.f49892a = str;
        this.f49893b = str2;
        this.f49894c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f49892a.equals(q0Var.f49892a) && this.f49893b.equals(q0Var.f49893b) && this.f49894c == q0Var.f49894c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f49894c;
        return ((((this.f49892a.hashCode() ^ 1000003) * 1000003) ^ this.f49893b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f49892a);
        sb2.append(", code=");
        sb2.append(this.f49893b);
        sb2.append(", address=");
        return a4.a.r(sb2, this.f49894c, "}");
    }
}
