package y9;
public final class q0 extends p1 {
    public final String f49862a;
    public final String f49863b;
    public final long f49864c;

    public q0(long j3, String str, String str2) {
        this.f49862a = str;
        this.f49863b = str2;
        this.f49864c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            q0 q0Var = (q0) ((p1) obj);
            if (this.f49862a.equals(q0Var.f49862a) && this.f49863b.equals(q0Var.f49863b) && this.f49864c == q0Var.f49864c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f49864c;
        return ((((this.f49862a.hashCode() ^ 1000003) * 1000003) ^ this.f49863b.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f49862a);
        sb2.append(", code=");
        sb2.append(this.f49863b);
        sb2.append(", address=");
        return a4.a.r(sb2, this.f49864c, "}");
    }
}
