package y9;
public final class q0 extends p1 {
    public final String f46890a;
    public final String f46891b;
    public final long f46892c;

    public q0(long j3, String str, String str2) {
        this.f46890a = str;
        this.f46891b = str2;
        this.f46892c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46890a.equals(q0Var.f46890a) && this.f46891b.equals(q0Var.f46891b) && this.f46892c == q0Var.f46892c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46892c;
        return ((((this.f46890a.hashCode() ^ 1000003) * 1000003) ^ this.f46891b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46890a);
        sb2.append(", code=");
        sb2.append(this.f46891b);
        sb2.append(", address=");
        return a4.a.s(sb2, this.f46892c, "}");
    }
}
