package z9;
public final class q0 extends p1 {
    public final String f51464a;
    public final String f51465b;
    public final long f51466c;

    public q0(long j10, String str, String str2) {
        this.f51464a = str;
        this.f51465b = str2;
        this.f51466c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f51464a.equals(q0Var.f51464a) && this.f51465b.equals(q0Var.f51465b) && this.f51466c == q0Var.f51466c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f51466c;
        return ((((this.f51464a.hashCode() ^ 1000003) * 1000003) ^ this.f51465b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f51464a);
        sb2.append(", code=");
        sb2.append(this.f51465b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.f51466c, "}");
    }
}
