package z9;
public final class w0 extends y1 {
    public final x1 f51491a;
    public final String f51492b;
    public final String f51493c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f51491a = x0Var;
        this.f51492b = str;
        this.f51493c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f51491a.equals(w0Var.f51491a) && this.f51492b.equals(w0Var.f51492b) && this.f51493c.equals(w0Var.f51493c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f51491a.hashCode() ^ 1000003) * 1000003) ^ this.f51492b.hashCode()) * 1000003) ^ this.f51493c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f51491a);
        sb2.append(", parameterKey=");
        sb2.append(this.f51492b);
        sb2.append(", parameterValue=");
        sb2.append(this.f51493c);
        sb2.append(", templateVersion=");
        return a1.g.r(sb2, this.d, "}");
    }
}
