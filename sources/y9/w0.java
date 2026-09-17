package y9;
public final class w0 extends y1 {
    public final x1 f49907a;
    public final String f49908b;
    public final String f49909c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f49907a = x0Var;
        this.f49908b = str;
        this.f49909c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f49907a.equals(w0Var.f49907a) && this.f49908b.equals(w0Var.f49908b) && this.f49909c.equals(w0Var.f49909c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f49907a.hashCode() ^ 1000003) * 1000003) ^ this.f49908b.hashCode()) * 1000003) ^ this.f49909c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f49907a);
        sb2.append(", parameterKey=");
        sb2.append(this.f49908b);
        sb2.append(", parameterValue=");
        sb2.append(this.f49909c);
        sb2.append(", templateVersion=");
        return a4.a.r(sb2, this.d, "}");
    }
}
