package y9;
public final class w0 extends y1 {
    public final x1 f50796a;
    public final String f50797b;
    public final String f50798c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f50796a = x0Var;
        this.f50797b = str;
        this.f50798c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f50796a.equals(w0Var.f50796a) && this.f50797b.equals(w0Var.f50797b) && this.f50798c.equals(w0Var.f50798c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f50796a.hashCode() ^ 1000003) * 1000003) ^ this.f50797b.hashCode()) * 1000003) ^ this.f50798c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f50796a);
        sb2.append(", parameterKey=");
        sb2.append(this.f50797b);
        sb2.append(", parameterValue=");
        sb2.append(this.f50798c);
        sb2.append(", templateVersion=");
        return a4.a.s(sb2, this.d, "}");
    }
}
