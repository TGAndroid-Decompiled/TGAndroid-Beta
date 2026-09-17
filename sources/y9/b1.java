package y9;
public final class b1 {
    public final c1 f49709a;
    public final e1 f49710b;
    public final d1 f49711c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f49709a = c1Var;
        this.f49710b = e1Var;
        this.f49711c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f49709a.equals(b1Var.f49709a) && this.f49710b.equals(b1Var.f49710b) && this.f49711c.equals(b1Var.f49711c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49709a.hashCode() ^ 1000003) * 1000003) ^ this.f49710b.hashCode()) * 1000003) ^ this.f49711c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f49709a + ", osData=" + this.f49710b + ", deviceData=" + this.f49711c + "}";
    }
}
