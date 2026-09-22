package y9;
public final class w0 extends y1 {
    public final x1 f46970a;
    public final String f46971b;
    public final String f46972c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f46970a = x0Var;
        this.f46971b = str;
        this.f46972c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f46970a.equals(w0Var.f46970a) && this.f46971b.equals(w0Var.f46971b) && this.f46972c.equals(w0Var.f46972c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f46970a.hashCode() ^ 1000003) * 1000003) ^ this.f46971b.hashCode()) * 1000003) ^ this.f46972c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f46970a);
        sb2.append(", parameterKey=");
        sb2.append(this.f46971b);
        sb2.append(", parameterValue=");
        sb2.append(this.f46972c);
        sb2.append(", templateVersion=");
        return a4.a.r(sb2, this.d, "}");
    }
}
