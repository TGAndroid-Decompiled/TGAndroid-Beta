package z9;
public final class q0 extends p1 {
    public final String f50070a;
    public final String f50071b;
    public final long f50072c;

    public q0(long j10, String str, String str2) {
        this.f50070a = str;
        this.f50071b = str2;
        this.f50072c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f50070a.equals(q0Var.f50070a) && this.f50071b.equals(q0Var.f50071b) && this.f50072c == q0Var.f50072c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f50072c;
        return ((((this.f50070a.hashCode() ^ 1000003) * 1000003) ^ this.f50071b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f50070a);
        sb2.append(", code=");
        sb2.append(this.f50071b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.f50072c, "}");
    }
}
