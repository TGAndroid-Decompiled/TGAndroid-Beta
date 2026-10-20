package z9;
public final class w0 extends y1 {
    public final x1 f51498a;
    public final String f51499b;
    public final String f51500c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f51498a = x0Var;
        this.f51499b = str;
        this.f51500c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f51498a.equals(w0Var.f51498a) && this.f51499b.equals(w0Var.f51499b) && this.f51500c.equals(w0Var.f51500c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f51498a.hashCode() ^ 1000003) * 1000003) ^ this.f51499b.hashCode()) * 1000003) ^ this.f51500c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f51498a);
        sb2.append(", parameterKey=");
        sb2.append(this.f51499b);
        sb2.append(", parameterValue=");
        sb2.append(this.f51500c);
        sb2.append(", templateVersion=");
        return a1.g.r(sb2, this.d, "}");
    }
}
