package y9;
public final class w0 extends y1 {
    public final x1 f49935a;
    public final String f49936b;
    public final String f49937c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f49935a = x0Var;
        this.f49936b = str;
        this.f49937c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f49935a.equals(w0Var.f49935a) && this.f49936b.equals(w0Var.f49936b) && this.f49937c.equals(w0Var.f49937c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f49935a.hashCode() ^ 1000003) * 1000003) ^ this.f49936b.hashCode()) * 1000003) ^ this.f49937c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f49935a);
        sb2.append(", parameterKey=");
        sb2.append(this.f49936b);
        sb2.append(", parameterValue=");
        sb2.append(this.f49937c);
        sb2.append(", templateVersion=");
        return a4.a.r(sb2, this.d, "}");
    }
}
