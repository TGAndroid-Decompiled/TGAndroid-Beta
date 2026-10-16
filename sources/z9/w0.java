package z9;
public final class w0 extends y1 {
    public final x1 f50108a;
    public final String f50109b;
    public final String f50110c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f50108a = x0Var;
        this.f50109b = str;
        this.f50110c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f50108a.equals(w0Var.f50108a) && this.f50109b.equals(w0Var.f50109b) && this.f50110c.equals(w0Var.f50110c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f50108a.hashCode() ^ 1000003) * 1000003) ^ this.f50109b.hashCode()) * 1000003) ^ this.f50110c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f50108a);
        sb2.append(", parameterKey=");
        sb2.append(this.f50109b);
        sb2.append(", parameterValue=");
        sb2.append(this.f50110c);
        sb2.append(", templateVersion=");
        return a1.g.r(sb2, this.d, "}");
    }
}
