package y9;
public final class q0 extends p1 {
    public final String f46911a;
    public final String f46912b;
    public final long f46913c;

    public q0(long j3, String str, String str2) {
        this.f46911a = str;
        this.f46912b = str2;
        this.f46913c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46911a.equals(q0Var.f46911a) && this.f46912b.equals(q0Var.f46912b) && this.f46913c == q0Var.f46913c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46913c;
        return ((((this.f46911a.hashCode() ^ 1000003) * 1000003) ^ this.f46912b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46911a);
        sb2.append(", code=");
        sb2.append(this.f46912b);
        sb2.append(", address=");
        return a4.a.r(sb2, this.f46913c, "}");
    }
}
