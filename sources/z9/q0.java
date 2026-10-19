package z9;
public final class q0 extends p1 {
    public final String f51455a;
    public final String f51456b;
    public final long f51457c;

    public q0(long j10, String str, String str2) {
        this.f51455a = str;
        this.f51456b = str2;
        this.f51457c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f51455a.equals(q0Var.f51455a) && this.f51456b.equals(q0Var.f51456b) && this.f51457c == q0Var.f51457c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f51457c;
        return ((((this.f51455a.hashCode() ^ 1000003) * 1000003) ^ this.f51456b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f51455a);
        sb2.append(", code=");
        sb2.append(this.f51456b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.f51457c, "}");
    }
}
