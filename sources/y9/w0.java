package y9;
public final class w0 extends y1 {
    public final x1 f52171a;
    public final String f52172b;
    public final String f52173c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f52171a = x0Var;
        this.f52172b = str;
        this.f52173c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f52171a.equals(w0Var.f52171a) && this.f52172b.equals(w0Var.f52172b) && this.f52173c.equals(w0Var.f52173c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f52171a.hashCode() ^ 1000003) * 1000003) ^ this.f52172b.hashCode()) * 1000003) ^ this.f52173c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f52171a);
        sb2.append(", parameterKey=");
        sb2.append(this.f52172b);
        sb2.append(", parameterValue=");
        sb2.append(this.f52173c);
        sb2.append(", templateVersion=");
        return a1.g.s(sb2, this.d, "}");
    }
}
