package y9;
public final class w0 extends y1 {
    public final x1 f46915a;
    public final String f46916b;
    public final String f46917c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f46915a = x0Var;
        this.f46916b = str;
        this.f46917c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f46915a.equals(w0Var.f46915a) && this.f46916b.equals(w0Var.f46916b) && this.f46917c.equals(w0Var.f46917c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f46915a.hashCode() ^ 1000003) * 1000003) ^ this.f46916b.hashCode()) * 1000003) ^ this.f46917c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f46915a);
        sb2.append(", parameterKey=");
        sb2.append(this.f46916b);
        sb2.append(", parameterValue=");
        sb2.append(this.f46917c);
        sb2.append(", templateVersion=");
        return a4.a.s(sb2, this.d, "}");
    }
}
