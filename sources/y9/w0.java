package y9;
public final class w0 extends y1 {
    public final x1 f46670a;
    public final String f46671b;
    public final String f46672c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f46670a = x0Var;
        this.f46671b = str;
        this.f46672c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f46670a.equals(w0Var.f46670a) && this.f46671b.equals(w0Var.f46671b) && this.f46672c.equals(w0Var.f46672c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f46670a.hashCode() ^ 1000003) * 1000003) ^ this.f46671b.hashCode()) * 1000003) ^ this.f46672c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f46670a);
        sb2.append(", parameterKey=");
        sb2.append(this.f46671b);
        sb2.append(", parameterValue=");
        sb2.append(this.f46672c);
        sb2.append(", templateVersion=");
        return a4.a.r(sb2, this.d, "}");
    }
}
