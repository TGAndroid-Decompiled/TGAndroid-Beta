package z9;
public final class w0 extends y1 {
    public final x1 f51493a;
    public final String f51494b;
    public final String f51495c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f51493a = x0Var;
        this.f51494b = str;
        this.f51495c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f51493a.equals(w0Var.f51493a) && this.f51494b.equals(w0Var.f51494b) && this.f51495c.equals(w0Var.f51495c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f51493a.hashCode() ^ 1000003) * 1000003) ^ this.f51494b.hashCode()) * 1000003) ^ this.f51495c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f51493a);
        sb2.append(", parameterKey=");
        sb2.append(this.f51494b);
        sb2.append(", parameterValue=");
        sb2.append(this.f51495c);
        sb2.append(", templateVersion=");
        return a1.g.r(sb2, this.d, "}");
    }
}
