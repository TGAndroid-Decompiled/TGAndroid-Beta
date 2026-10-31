package z9;
public final class q0 extends p1 {
    public final String f55372a;
    public final String f55373b;
    public final long f55374c;

    public q0(long j10, String str, String str2) {
        this.f55372a = str;
        this.f55373b = str2;
        this.f55374c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f55372a.equals(q0Var.f55372a) && this.f55373b.equals(q0Var.f55373b) && this.f55374c == q0Var.f55374c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f55374c;
        return ((((this.f55372a.hashCode() ^ 1000003) * 1000003) ^ this.f55373b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f55372a);
        sb2.append(", code=");
        sb2.append(this.f55373b);
        sb2.append(", address=");
        return a1.g.q(sb2, this.f55374c, "}");
    }
}
