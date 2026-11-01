package z9;
public final class q0 extends p1 {
    public final String f55390a;
    public final String f55391b;
    public final long f55392c;

    public q0(long j10, String str, String str2) {
        this.f55390a = str;
        this.f55391b = str2;
        this.f55392c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f55390a.equals(q0Var.f55390a) && this.f55391b.equals(q0Var.f55391b) && this.f55392c == q0Var.f55392c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f55392c;
        return ((((this.f55390a.hashCode() ^ 1000003) * 1000003) ^ this.f55391b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f55390a);
        sb2.append(", code=");
        sb2.append(this.f55391b);
        sb2.append(", address=");
        return a1.g.q(sb2, this.f55392c, "}");
    }
}
