package y9;
public final class b1 {
    public final c1 f46428a;
    public final e1 f46429b;
    public final d1 f46430c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46428a = c1Var;
        this.f46429b = e1Var;
        this.f46430c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46428a.equals(b1Var.f46428a) && this.f46429b.equals(b1Var.f46429b) && this.f46430c.equals(b1Var.f46430c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46428a.hashCode() ^ 1000003) * 1000003) ^ this.f46429b.hashCode()) * 1000003) ^ this.f46430c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46428a + ", osData=" + this.f46429b + ", deviceData=" + this.f46430c + "}";
    }
}
