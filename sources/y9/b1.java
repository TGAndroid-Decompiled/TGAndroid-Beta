package y9;
public final class b1 {
    public final c1 f51973a;
    public final e1 f51974b;
    public final d1 f51975c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f51973a = c1Var;
        this.f51974b = e1Var;
        this.f51975c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f51973a.equals(b1Var.f51973a) && this.f51974b.equals(b1Var.f51974b) && this.f51975c.equals(b1Var.f51975c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51973a.hashCode() ^ 1000003) * 1000003) ^ this.f51974b.hashCode()) * 1000003) ^ this.f51975c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f51973a + ", osData=" + this.f51974b + ", deviceData=" + this.f51975c + "}";
    }
}
