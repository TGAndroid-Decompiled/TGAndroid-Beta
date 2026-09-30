package y9;
public final class b1 {
    public final c1 f46755a;
    public final e1 f46756b;
    public final d1 f46757c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46755a = c1Var;
        this.f46756b = e1Var;
        this.f46757c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46755a.equals(b1Var.f46755a) && this.f46756b.equals(b1Var.f46756b) && this.f46757c.equals(b1Var.f46757c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46755a.hashCode() ^ 1000003) * 1000003) ^ this.f46756b.hashCode()) * 1000003) ^ this.f46757c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46755a + ", osData=" + this.f46756b + ", deviceData=" + this.f46757c + "}";
    }
}
