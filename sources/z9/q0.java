package z9;
public final class q0 extends p1 {
    public final String f51924a;
    public final String f51925b;
    public final long f51926c;

    public q0(long j10, String str, String str2) {
        this.f51924a = str;
        this.f51925b = str2;
        this.f51926c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f51924a.equals(q0Var.f51924a) && this.f51925b.equals(q0Var.f51925b) && this.f51926c == q0Var.f51926c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f51926c;
        return ((((this.f51924a.hashCode() ^ 1000003) * 1000003) ^ this.f51925b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f51924a);
        sb2.append(", code=");
        sb2.append(this.f51925b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.f51926c, "}");
    }
}
