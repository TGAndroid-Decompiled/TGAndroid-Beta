package y9;
public final class w0 extends y1 {
    public final x1 f46925a;
    public final String f46926b;
    public final String f46927c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f46925a = x0Var;
        this.f46926b = str;
        this.f46927c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f46925a.equals(w0Var.f46925a) && this.f46926b.equals(w0Var.f46926b) && this.f46927c.equals(w0Var.f46927c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f46925a.hashCode() ^ 1000003) * 1000003) ^ this.f46926b.hashCode()) * 1000003) ^ this.f46927c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f46925a);
        sb2.append(", parameterKey=");
        sb2.append(this.f46926b);
        sb2.append(", parameterValue=");
        sb2.append(this.f46927c);
        sb2.append(", templateVersion=");
        return a4.a.s(sb2, this.d, "}");
    }
}
