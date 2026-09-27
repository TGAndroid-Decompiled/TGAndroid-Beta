package y9;
public final class b1 {
    public final c1 f46798a;
    public final e1 f46799b;
    public final d1 f46800c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46798a = c1Var;
        this.f46799b = e1Var;
        this.f46800c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46798a.equals(b1Var.f46798a) && this.f46799b.equals(b1Var.f46799b) && this.f46800c.equals(b1Var.f46800c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46798a.hashCode() ^ 1000003) * 1000003) ^ this.f46799b.hashCode()) * 1000003) ^ this.f46800c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46798a + ", osData=" + this.f46799b + ", deviceData=" + this.f46800c + "}";
    }
}
