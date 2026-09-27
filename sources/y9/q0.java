package y9;
public final class q0 extends p1 {
    public final String f46933a;
    public final String f46934b;
    public final long f46935c;

    public q0(long j3, String str, String str2) {
        this.f46933a = str;
        this.f46934b = str2;
        this.f46935c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46933a.equals(q0Var.f46933a) && this.f46934b.equals(q0Var.f46934b) && this.f46935c == q0Var.f46935c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46935c;
        return ((((this.f46933a.hashCode() ^ 1000003) * 1000003) ^ this.f46934b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46933a);
        sb2.append(", code=");
        sb2.append(this.f46934b);
        sb2.append(", address=");
        return a4.a.r(sb2, this.f46935c, "}");
    }
}
