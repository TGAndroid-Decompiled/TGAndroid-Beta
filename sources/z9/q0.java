package z9;
public final class q0 extends p1 {
    public final String f50069a;
    public final String f50070b;
    public final long f50071c;

    public q0(long j10, String str, String str2) {
        this.f50069a = str;
        this.f50070b = str2;
        this.f50071c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f50069a.equals(q0Var.f50069a) && this.f50070b.equals(q0Var.f50070b) && this.f50071c == q0Var.f50071c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f50071c;
        return ((((this.f50069a.hashCode() ^ 1000003) * 1000003) ^ this.f50070b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f50069a);
        sb2.append(", code=");
        sb2.append(this.f50070b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.f50071c, "}");
    }
}
