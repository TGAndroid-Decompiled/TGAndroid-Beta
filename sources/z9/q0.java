package z9;
public final class q0 extends p1 {
    public final String f51453a;
    public final String f51454b;
    public final long f51455c;

    public q0(long j10, String str, String str2) {
        this.f51453a = str;
        this.f51454b = str2;
        this.f51455c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f51453a.equals(q0Var.f51453a) && this.f51454b.equals(q0Var.f51454b) && this.f51455c == q0Var.f51455c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f51455c;
        return ((((this.f51453a.hashCode() ^ 1000003) * 1000003) ^ this.f51454b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f51453a);
        sb2.append(", code=");
        sb2.append(this.f51454b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.f51455c, "}");
    }
}
