package y9;
public final class w0 extends y1 {
    public final x1 f46643a;
    public final String f46644b;
    public final String f46645c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f46643a = x0Var;
        this.f46644b = str;
        this.f46645c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f46643a.equals(w0Var.f46643a) && this.f46644b.equals(w0Var.f46644b) && this.f46645c.equals(w0Var.f46645c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f46643a.hashCode() ^ 1000003) * 1000003) ^ this.f46644b.hashCode()) * 1000003) ^ this.f46645c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f46643a);
        sb2.append(", parameterKey=");
        sb2.append(this.f46644b);
        sb2.append(", parameterValue=");
        sb2.append(this.f46645c);
        sb2.append(", templateVersion=");
        return a4.a.s(sb2, this.d, "}");
    }
}
