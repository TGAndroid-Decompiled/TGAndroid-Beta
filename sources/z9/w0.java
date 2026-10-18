package z9;
public final class w0 extends y1 {
    public final x1 f51538a;
    public final String f51539b;
    public final String f51540c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f51538a = x0Var;
        this.f51539b = str;
        this.f51540c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f51538a.equals(w0Var.f51538a) && this.f51539b.equals(w0Var.f51539b) && this.f51540c.equals(w0Var.f51540c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f51538a.hashCode() ^ 1000003) * 1000003) ^ this.f51539b.hashCode()) * 1000003) ^ this.f51540c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f51538a);
        sb2.append(", parameterKey=");
        sb2.append(this.f51539b);
        sb2.append(", parameterValue=");
        sb2.append(this.f51540c);
        sb2.append(", templateVersion=");
        return a1.g.r(sb2, this.d, "}");
    }
}
