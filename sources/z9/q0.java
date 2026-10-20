package z9;
public final class q0 extends p1 {
    public final String f51460a;
    public final String f51461b;
    public final long f51462c;

    public q0(long j10, String str, String str2) {
        this.f51460a = str;
        this.f51461b = str2;
        this.f51462c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f51460a.equals(q0Var.f51460a) && this.f51461b.equals(q0Var.f51461b) && this.f51462c == q0Var.f51462c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f51462c;
        return ((((this.f51460a.hashCode() ^ 1000003) * 1000003) ^ this.f51461b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f51460a);
        sb2.append(", code=");
        sb2.append(this.f51461b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.f51462c, "}");
    }
}
