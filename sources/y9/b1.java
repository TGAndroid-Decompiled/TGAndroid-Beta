package y9;
public final class b1 {
    public final c1 f46861a;
    public final e1 f46862b;
    public final d1 f46863c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46861a = c1Var;
        this.f46862b = e1Var;
        this.f46863c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46861a.equals(b1Var.f46861a) && this.f46862b.equals(b1Var.f46862b) && this.f46863c.equals(b1Var.f46863c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46861a.hashCode() ^ 1000003) * 1000003) ^ this.f46862b.hashCode()) * 1000003) ^ this.f46863c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46861a + ", osData=" + this.f46862b + ", deviceData=" + this.f46863c + "}";
    }
}
