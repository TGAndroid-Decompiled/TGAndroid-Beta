package y9;
public final class q0 extends p1 {
    public final String f46637a;
    public final String f46638b;
    public final long f46639c;

    public q0(long j3, String str, String str2) {
        this.f46637a = str;
        this.f46638b = str2;
        this.f46639c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46637a.equals(q0Var.f46637a) && this.f46638b.equals(q0Var.f46638b) && this.f46639c == q0Var.f46639c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46639c;
        return ((((this.f46637a.hashCode() ^ 1000003) * 1000003) ^ this.f46638b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46637a);
        sb2.append(", code=");
        sb2.append(this.f46638b);
        sb2.append(", address=");
        return a4.a.r(sb2, this.f46639c, "}");
    }
}
