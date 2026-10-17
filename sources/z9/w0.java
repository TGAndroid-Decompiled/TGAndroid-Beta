package z9;
public final class w0 extends y1 {
    public final x1 f51513a;
    public final String f51514b;
    public final String f51515c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j10) {
        this.f51513a = x0Var;
        this.f51514b = str;
        this.f51515c = str2;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f51513a.equals(w0Var.f51513a) && this.f51514b.equals(w0Var.f51514b) && this.f51515c.equals(w0Var.f51515c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.d;
        return ((((((this.f51513a.hashCode() ^ 1000003) * 1000003) ^ this.f51514b.hashCode()) * 1000003) ^ this.f51515c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f51513a);
        sb2.append(", parameterKey=");
        sb2.append(this.f51514b);
        sb2.append(", parameterValue=");
        sb2.append(this.f51515c);
        sb2.append(", templateVersion=");
        return a1.g.r(sb2, this.d, "}");
    }
}
