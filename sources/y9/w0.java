package y9;
public final class w0 extends y1 {
    public final x1 f52082a;
    public final String f52083b;
    public final String f52084c;
    public final long d;

    public w0(x0 x0Var, String str, String str2, long j3) {
        this.f52082a = x0Var;
        this.f52083b = str;
        this.f52084c = str2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            w0 w0Var = (w0) ((y1) obj);
            if (this.f52082a.equals(w0Var.f52082a) && this.f52083b.equals(w0Var.f52083b) && this.f52084c.equals(w0Var.f52084c) && this.d == w0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.d;
        return ((((((this.f52082a.hashCode() ^ 1000003) * 1000003) ^ this.f52083b.hashCode()) * 1000003) ^ this.f52084c.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f52082a);
        sb2.append(", parameterKey=");
        sb2.append(this.f52083b);
        sb2.append(", parameterValue=");
        sb2.append(this.f52084c);
        sb2.append(", templateVersion=");
        return a1.g.s(sb2, this.d, "}");
    }
}
