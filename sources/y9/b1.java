package y9;
public final class b1 {
    public final c1 f46776a;
    public final e1 f46777b;
    public final d1 f46778c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46776a = c1Var;
        this.f46777b = e1Var;
        this.f46778c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46776a.equals(b1Var.f46776a) && this.f46777b.equals(b1Var.f46777b) && this.f46778c.equals(b1Var.f46778c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46776a.hashCode() ^ 1000003) * 1000003) ^ this.f46777b.hashCode()) * 1000003) ^ this.f46778c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46776a + ", osData=" + this.f46777b + ", deviceData=" + this.f46778c + "}";
    }
}
