package z9;
public final class q0 extends p1 {
    public final String f51463a;
    public final String f51464b;
    public final long f51465c;

    public q0(long j10, String str, String str2) {
        this.f51463a = str;
        this.f51464b = str2;
        this.f51465c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f51463a.equals(q0Var.f51463a) && this.f51464b.equals(q0Var.f51464b) && this.f51465c == q0Var.f51465c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f51465c;
        return ((((this.f51463a.hashCode() ^ 1000003) * 1000003) ^ this.f51464b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f51463a);
        sb2.append(", code=");
        sb2.append(this.f51464b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.f51465c, "}");
    }
}
