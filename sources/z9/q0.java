package z9;
public final class q0 extends p1 {
    public final String f51925a;
    public final String f51926b;
    public final long f51927c;

    public q0(long j10, String str, String str2) {
        this.f51925a = str;
        this.f51926b = str2;
        this.f51927c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f51925a.equals(q0Var.f51925a) && this.f51926b.equals(q0Var.f51926b) && this.f51927c == q0Var.f51927c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f51927c;
        return ((((this.f51925a.hashCode() ^ 1000003) * 1000003) ^ this.f51926b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f51925a);
        sb2.append(", code=");
        sb2.append(this.f51926b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.f51927c, "}");
    }
}
