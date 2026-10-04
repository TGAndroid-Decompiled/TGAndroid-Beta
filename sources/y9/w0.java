package y9;
public final class w0 extends y1 {
    public final x1 f50788a;
    public final String f50789b;
    public final String f50790c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f50788a = x0Var;
        this.f50789b = str;
        this.f50790c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f50788a.equals(w0Var.f50788a) && this.f50789b.equals(w0Var.f50789b) && this.f50790c.equals(w0Var.f50790c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f50788a.hashCode() ^ 1000003) * 1000003) ^ this.f50789b.hashCode()) * 1000003) ^ this.f50790c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f50788a);
        sb2.append(", parameterKey=");
        sb2.append(this.f50789b);
        sb2.append(", parameterValue=");
        sb2.append(this.f50790c);
        sb2.append(", templateVersion=");
        return a4.a.r(sb2, this.d, "}");
    }
}
