package z9;
public final class b1 {
    public final c1 f51318a;
    public final e1 f51319b;
    public final d1 f51320c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f51318a = c1Var;
        this.f51319b = e1Var;
        this.f51320c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f51318a.equals(b1Var.f51318a) && this.f51319b.equals(b1Var.f51319b) && this.f51320c.equals(b1Var.f51320c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51318a.hashCode() ^ 1000003) * 1000003) ^ this.f51319b.hashCode()) * 1000003) ^ this.f51320c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f51318a + ", osData=" + this.f51319b + ", deviceData=" + this.f51320c + "}";
    }
}
