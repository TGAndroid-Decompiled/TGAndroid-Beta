package y9;
public final class b1 {
    public final c1 f49738a;
    public final e1 f49739b;
    public final d1 f49740c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f49738a = c1Var;
        this.f49739b = e1Var;
        this.f49740c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f49738a.equals(b1Var.f49738a) && this.f49739b.equals(b1Var.f49739b) && this.f49740c.equals(b1Var.f49740c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49738a.hashCode() ^ 1000003) * 1000003) ^ this.f49739b.hashCode()) * 1000003) ^ this.f49740c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f49738a + ", osData=" + this.f49739b + ", deviceData=" + this.f49740c + "}";
    }
}
