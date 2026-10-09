package y9;
public final class w0 extends y1 {
    public final x1 f52084a;
    public final String f52085b;
    public final String f52086c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f52084a = x0Var;
        this.f52085b = str;
        this.f52086c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f52084a.equals(w0Var.f52084a) && this.f52085b.equals(w0Var.f52085b) && this.f52086c.equals(w0Var.f52086c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f52084a.hashCode() ^ 1000003) * 1000003) ^ this.f52085b.hashCode()) * 1000003) ^ this.f52086c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f52084a);
        sb2.append(", parameterKey=");
        sb2.append(this.f52085b);
        sb2.append(", parameterValue=");
        sb2.append(this.f52086c);
        sb2.append(", templateVersion=");
        return a1.g.s(sb2, this.d, "}");
    }
}
