package y9;
public final class w0 extends y1 {
    public final x1 f52316a;
    public final String f52317b;
    public final String f52318c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f52316a = x0Var;
        this.f52317b = str;
        this.f52318c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f52316a.equals(w0Var.f52316a) && this.f52317b.equals(w0Var.f52317b) && this.f52318c.equals(w0Var.f52318c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f52316a.hashCode() ^ 1000003) * 1000003) ^ this.f52317b.hashCode()) * 1000003) ^ this.f52318c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f52316a);
        sb2.append(", parameterKey=");
        sb2.append(this.f52317b);
        sb2.append(", parameterValue=");
        sb2.append(this.f52318c);
        sb2.append(", templateVersion=");
        return a1.g.s(sb2, this.d, "}");
    }
}
