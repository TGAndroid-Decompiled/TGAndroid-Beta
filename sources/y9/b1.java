package y9;
public final class b1 {
    public final c1 f49737a;
    public final e1 f49738b;
    public final d1 f49739c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f49737a = c1Var;
        this.f49738b = e1Var;
        this.f49739c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f49737a.equals(b1Var.f49737a) && this.f49738b.equals(b1Var.f49738b) && this.f49739c.equals(b1Var.f49739c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49737a.hashCode() ^ 1000003) * 1000003) ^ this.f49738b.hashCode()) * 1000003) ^ this.f49739c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f49737a + ", osData=" + this.f49738b + ", deviceData=" + this.f49739c + "}";
    }
}
