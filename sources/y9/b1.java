package y9;
public final class b1 {
    public final c1 f51884a;
    public final e1 f51885b;
    public final d1 f51886c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f51884a = c1Var;
        this.f51885b = e1Var;
        this.f51886c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f51884a.equals(b1Var.f51884a) && this.f51885b.equals(b1Var.f51885b) && this.f51886c.equals(b1Var.f51886c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51884a.hashCode() ^ 1000003) * 1000003) ^ this.f51885b.hashCode()) * 1000003) ^ this.f51886c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f51884a + ", osData=" + this.f51885b + ", deviceData=" + this.f51886c + "}";
    }
}
