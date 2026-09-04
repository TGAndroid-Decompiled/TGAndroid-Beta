package y9;
public final class w0 extends y1 {
    public final x1 f49906a;
    public final String f49907b;
    public final String f49908c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f49906a = x0Var;
        this.f49907b = str;
        this.f49908c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f49906a.equals(w0Var.f49906a) && this.f49907b.equals(w0Var.f49907b) && this.f49908c.equals(w0Var.f49908c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f49906a.hashCode() ^ 1000003) * 1000003) ^ this.f49907b.hashCode()) * 1000003) ^ this.f49908c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f49906a);
        sb2.append(", parameterKey=");
        sb2.append(this.f49907b);
        sb2.append(", parameterValue=");
        sb2.append(this.f49908c);
        sb2.append(", templateVersion=");
        return a4.a.r(sb2, this.d, "}");
    }
}
