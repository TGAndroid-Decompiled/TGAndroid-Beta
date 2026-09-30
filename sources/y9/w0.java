package y9;
public final class w0 extends y1 {
    public final x1 f47034a;
    public final String f47035b;
    public final String f47036c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f47034a = x0Var;
        this.f47035b = str;
        this.f47036c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f47034a.equals(w0Var.f47034a) && this.f47035b.equals(w0Var.f47035b) && this.f47036c.equals(w0Var.f47036c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f47034a.hashCode() ^ 1000003) * 1000003) ^ this.f47035b.hashCode()) * 1000003) ^ this.f47036c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f47034a);
        sb2.append(", parameterKey=");
        sb2.append(this.f47035b);
        sb2.append(", parameterValue=");
        sb2.append(this.f47036c);
        sb2.append(", templateVersion=");
        return a4.a.s(sb2, this.d, "}");
    }
}
