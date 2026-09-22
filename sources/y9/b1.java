package y9;
public final class b1 {
    public final c1 f46797a;
    public final e1 f46798b;
    public final d1 f46799c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46797a = c1Var;
        this.f46798b = e1Var;
        this.f46799c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46797a.equals(b1Var.f46797a) && this.f46798b.equals(b1Var.f46798b) && this.f46799c.equals(b1Var.f46799c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46797a.hashCode() ^ 1000003) * 1000003) ^ this.f46798b.hashCode()) * 1000003) ^ this.f46799c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46797a + ", osData=" + this.f46798b + ", deviceData=" + this.f46799c + "}";
    }
}
