package y9;
public final class b1 {
    public final c1 f51886a;
    public final e1 f51887b;
    public final d1 f51888c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f51886a = c1Var;
        this.f51887b = e1Var;
        this.f51888c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f51886a.equals(b1Var.f51886a) && this.f51887b.equals(b1Var.f51887b) && this.f51888c.equals(b1Var.f51888c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51886a.hashCode() ^ 1000003) * 1000003) ^ this.f51887b.hashCode()) * 1000003) ^ this.f51888c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f51886a + ", osData=" + this.f51887b + ", deviceData=" + this.f51888c + "}";
    }
}
