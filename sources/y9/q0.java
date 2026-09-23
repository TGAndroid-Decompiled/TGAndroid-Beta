package y9;
public final class q0 extends p1 {
    public final String f46563a;
    public final String f46564b;
    public final long f46565c;

    public q0(long j3, String str, String str2) {
        this.f46563a = str;
        this.f46564b = str2;
        this.f46565c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f46563a.equals(q0Var.f46563a) && this.f46564b.equals(q0Var.f46564b) && this.f46565c == q0Var.f46565c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46565c;
        return ((((this.f46563a.hashCode() ^ 1000003) * 1000003) ^ this.f46564b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f46563a);
        sb2.append(", code=");
        sb2.append(this.f46564b);
        sb2.append(", address=");
        return a4.a.s(sb2, this.f46565c, "}");
    }
}
