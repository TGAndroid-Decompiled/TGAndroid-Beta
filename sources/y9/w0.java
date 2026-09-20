package y9;
public final class w0 extends y1 {
    public final x1 f46949a;
    public final String f46950b;
    public final String f46951c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f46949a = x0Var;
        this.f46950b = str;
        this.f46951c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f46949a.equals(w0Var.f46949a) && this.f46950b.equals(w0Var.f46950b) && this.f46951c.equals(w0Var.f46951c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f46949a.hashCode() ^ 1000003) * 1000003) ^ this.f46950b.hashCode()) * 1000003) ^ this.f46951c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f46949a);
        sb2.append(", parameterKey=");
        sb2.append(this.f46950b);
        sb2.append(", parameterValue=");
        sb2.append(this.f46951c);
        sb2.append(", templateVersion=");
        return a4.a.r(sb2, this.d, "}");
    }
}
