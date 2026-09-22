package y9;
public final class q0 extends p1 {
    public final String f46932a;
    public final String f46933b;
    public final long f46934c;

    public q0(long j3, String str, String str2) {
        this.f46932a = str;
        this.f46933b = str2;
        this.f46934c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46932a.equals(q0Var.f46932a) && this.f46933b.equals(q0Var.f46933b) && this.f46934c == q0Var.f46934c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46934c;
        return ((((this.f46932a.hashCode() ^ 1000003) * 1000003) ^ this.f46933b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46932a);
        sb2.append(", code=");
        sb2.append(this.f46933b);
        sb2.append(", address=");
        return a4.a.r(sb2, this.f46934c, "}");
    }
}
