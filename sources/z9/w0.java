package z9;
public final class w0 extends y1 {
    public final x1 f55410a;
    public final String f55411b;
    public final String f55412c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f55410a = x0Var;
        this.f55411b = str;
        this.f55412c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f55410a.equals(w0Var.f55410a) && this.f55411b.equals(w0Var.f55411b) && this.f55412c.equals(w0Var.f55412c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f55410a.hashCode() ^ 1000003) * 1000003) ^ this.f55411b.hashCode()) * 1000003) ^ this.f55412c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f55410a);
        sb2.append(", parameterKey=");
        sb2.append(this.f55411b);
        sb2.append(", parameterValue=");
        sb2.append(this.f55412c);
        sb2.append(", templateVersion=");
        return a1.g.q(sb2, this.d, "}");
    }
}
