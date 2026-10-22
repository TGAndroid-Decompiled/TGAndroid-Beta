package z9;
public final class w0 extends y1 {
    public final x1 f51501a;
    public final String f51502b;
    public final String f51503c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f51501a = x0Var;
        this.f51502b = str;
        this.f51503c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f51501a.equals(w0Var.f51501a) && this.f51502b.equals(w0Var.f51502b) && this.f51503c.equals(w0Var.f51503c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f51501a.hashCode() ^ 1000003) * 1000003) ^ this.f51502b.hashCode()) * 1000003) ^ this.f51503c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f51501a);
        sb2.append(", parameterKey=");
        sb2.append(this.f51502b);
        sb2.append(", parameterValue=");
        sb2.append(this.f51503c);
        sb2.append(", templateVersion=");
        return a1.g.r(sb2, this.d, "}");
    }
}
