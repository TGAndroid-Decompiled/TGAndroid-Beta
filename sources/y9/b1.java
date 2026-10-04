package y9;
public final class b1 {
    public final c1 f50589a;
    public final e1 f50590b;
    public final d1 f50591c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f50589a = c1Var;
        this.f50590b = e1Var;
        this.f50591c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f50589a.equals(b1Var.f50589a) && this.f50590b.equals(b1Var.f50590b) && this.f50591c.equals(b1Var.f50591c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50589a.hashCode() ^ 1000003) * 1000003) ^ this.f50590b.hashCode()) * 1000003) ^ this.f50591c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f50589a + ", osData=" + this.f50590b + ", deviceData=" + this.f50591c + "}";
    }
}
