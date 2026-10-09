package y9;
public final class q0 extends p1 {
    public final String f52038a;
    public final String f52039b;
    public final long f52040c;

    public q0(long j3, String str, String str2) {
        this.f52038a = str;
        this.f52039b = str2;
        this.f52040c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f52038a.equals(q0Var.f52038a) && this.f52039b.equals(q0Var.f52039b) && this.f52040c == q0Var.f52040c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f52040c;
        return ((((this.f52038a.hashCode() ^ 1000003) * 1000003) ^ this.f52039b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f52038a);
        sb2.append(", code=");
        sb2.append(this.f52039b);
        sb2.append(", address=");
        return a1.g.s(sb2, this.f52040c, "}");
    }
}
