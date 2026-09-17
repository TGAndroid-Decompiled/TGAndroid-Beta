package y9;
public final class q0 extends p1 {
    public final String f46632a;
    public final String f46633b;
    public final long f46634c;

    public q0(long j3, String str, String str2) {
        this.f46632a = str;
        this.f46633b = str2;
        this.f46634c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46632a.equals(q0Var.f46632a) && this.f46633b.equals(q0Var.f46633b) && this.f46634c == q0Var.f46634c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46634c;
        return ((((this.f46632a.hashCode() ^ 1000003) * 1000003) ^ this.f46633b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46632a);
        sb2.append(", code=");
        sb2.append(this.f46633b);
        sb2.append(", address=");
        return a4.a.r(sb2, this.f46634c, "}");
    }
}
