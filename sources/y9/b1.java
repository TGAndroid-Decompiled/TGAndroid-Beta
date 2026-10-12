package y9;
public final class b1 {
    public final c1 f52118a;
    public final e1 f52119b;
    public final d1 f52120c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f52118a = c1Var;
        this.f52119b = e1Var;
        this.f52120c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f52118a.equals(b1Var.f52118a) && this.f52119b.equals(b1Var.f52119b) && this.f52120c.equals(b1Var.f52120c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f52118a.hashCode() ^ 1000003) * 1000003) ^ this.f52119b.hashCode()) * 1000003) ^ this.f52120c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f52118a + ", osData=" + this.f52119b + ", deviceData=" + this.f52120c + "}";
    }
}
