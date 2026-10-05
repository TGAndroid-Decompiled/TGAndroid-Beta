package y9;
public final class b1 {
    public final c1 f50605a;
    public final e1 f50606b;
    public final d1 f50607c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f50605a = c1Var;
        this.f50606b = e1Var;
        this.f50607c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f50605a.equals(b1Var.f50605a) && this.f50606b.equals(b1Var.f50606b) && this.f50607c.equals(b1Var.f50607c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50605a.hashCode() ^ 1000003) * 1000003) ^ this.f50606b.hashCode()) * 1000003) ^ this.f50607c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f50605a + ", osData=" + this.f50606b + ", deviceData=" + this.f50607c + "}";
    }
}
