package y9;
public final class b1 {
    public final c1 f49708a;
    public final e1 f49709b;
    public final d1 f49710c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f49708a = c1Var;
        this.f49709b = e1Var;
        this.f49710c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f49708a.equals(b1Var.f49708a) && this.f49709b.equals(b1Var.f49709b) && this.f49710c.equals(b1Var.f49710c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49708a.hashCode() ^ 1000003) * 1000003) ^ this.f49709b.hashCode()) * 1000003) ^ this.f49710c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f49708a + ", osData=" + this.f49709b + ", deviceData=" + this.f49710c + "}";
    }
}
