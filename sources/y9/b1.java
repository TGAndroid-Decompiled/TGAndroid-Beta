package y9;
public final class b1 {
    public final c1 f46753a;
    public final e1 f46754b;
    public final d1 f46755c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46753a = c1Var;
        this.f46754b = e1Var;
        this.f46755c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46753a.equals(b1Var.f46753a) && this.f46754b.equals(b1Var.f46754b) && this.f46755c.equals(b1Var.f46755c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46753a.hashCode() ^ 1000003) * 1000003) ^ this.f46754b.hashCode()) * 1000003) ^ this.f46755c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46753a + ", osData=" + this.f46754b + ", deviceData=" + this.f46755c + "}";
    }
}
