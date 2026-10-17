package z9;
public final class q0 extends p1 {
    public final String f51475a;
    public final String f51476b;
    public final long f51477c;

    public q0(long j10, String str, String str2) {
        this.f51475a = str;
        this.f51476b = str2;
        this.f51477c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f51475a.equals(q0Var.f51475a) && this.f51476b.equals(q0Var.f51476b) && this.f51477c == q0Var.f51477c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f51477c;
        return ((((this.f51475a.hashCode() ^ 1000003) * 1000003) ^ this.f51476b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f51475a);
        sb2.append(", code=");
        sb2.append(this.f51476b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.f51477c, "}");
    }
}
