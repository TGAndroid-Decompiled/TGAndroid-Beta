package z9;
public final class q0 extends p1 {
    public final String f51500a;
    public final String f51501b;
    public final long f51502c;

    public q0(long j10, String str, String str2) {
        this.f51500a = str;
        this.f51501b = str2;
        this.f51502c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f51500a.equals(q0Var.f51500a) && this.f51501b.equals(q0Var.f51501b) && this.f51502c == q0Var.f51502c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f51502c;
        return ((((this.f51500a.hashCode() ^ 1000003) * 1000003) ^ this.f51501b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f51500a);
        sb2.append(", code=");
        sb2.append(this.f51501b);
        sb2.append(", address=");
        return a1.g.r(sb2, this.f51502c, "}");
    }
}
