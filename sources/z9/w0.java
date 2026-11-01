package z9;
public final class w0 extends y1 {
    public final x1 f55428a;
    public final String f55429b;
    public final String f55430c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f55428a = x0Var;
        this.f55429b = str;
        this.f55430c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f55428a.equals(w0Var.f55428a) && this.f55429b.equals(w0Var.f55429b) && this.f55430c.equals(w0Var.f55430c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f55428a.hashCode() ^ 1000003) * 1000003) ^ this.f55429b.hashCode()) * 1000003) ^ this.f55430c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f55428a);
        sb2.append(", parameterKey=");
        sb2.append(this.f55429b);
        sb2.append(", parameterValue=");
        sb2.append(this.f55430c);
        sb2.append(", templateVersion=");
        return a1.g.q(sb2, this.d, "}");
    }
}
