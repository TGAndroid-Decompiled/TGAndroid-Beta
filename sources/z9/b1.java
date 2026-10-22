package z9;
public final class b1 {
    public final c1 f51328a;
    public final e1 f51329b;
    public final d1 f51330c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f51328a = c1Var;
        this.f51329b = e1Var;
        this.f51330c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f51328a.equals(b1Var.f51328a) && this.f51329b.equals(b1Var.f51329b) && this.f51330c.equals(b1Var.f51330c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51328a.hashCode() ^ 1000003) * 1000003) ^ this.f51329b.hashCode()) * 1000003) ^ this.f51330c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f51328a + ", osData=" + this.f51329b + ", deviceData=" + this.f51330c + "}";
    }
}
