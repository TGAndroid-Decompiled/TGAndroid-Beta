package y9;
public final class w0 extends y1 {
    public final x1 f46926a;
    public final String f46927b;
    public final String f46928c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f46926a = x0Var;
        this.f46927b = str;
        this.f46928c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f46926a.equals(w0Var.f46926a) && this.f46927b.equals(w0Var.f46927b) && this.f46928c.equals(w0Var.f46928c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f46926a.hashCode() ^ 1000003) * 1000003) ^ this.f46927b.hashCode()) * 1000003) ^ this.f46928c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f46926a);
        sb2.append(", parameterKey=");
        sb2.append(this.f46927b);
        sb2.append(", parameterValue=");
        sb2.append(this.f46928c);
        sb2.append(", templateVersion=");
        return a4.a.s(sb2, this.d, "}");
    }
}
