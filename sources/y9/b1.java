package y9;
public final class b1 {
    public final c1 f52007a;
    public final e1 f52008b;
    public final d1 f52009c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f52007a = c1Var;
        this.f52008b = e1Var;
        this.f52009c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f52007a.equals(b1Var.f52007a) && this.f52008b.equals(b1Var.f52008b) && this.f52009c.equals(b1Var.f52009c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f52007a.hashCode() ^ 1000003) * 1000003) ^ this.f52008b.hashCode()) * 1000003) ^ this.f52009c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f52007a + ", osData=" + this.f52008b + ", deviceData=" + this.f52009c + "}";
    }
}
