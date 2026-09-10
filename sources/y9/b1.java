package y9;
public final class b1 {
    public final c1 f46624a;
    public final e1 f46625b;
    public final d1 f46626c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46624a = c1Var;
        this.f46625b = e1Var;
        this.f46626c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46624a.equals(b1Var.f46624a) && this.f46625b.equals(b1Var.f46625b) && this.f46626c.equals(b1Var.f46626c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46624a.hashCode() ^ 1000003) * 1000003) ^ this.f46625b.hashCode()) * 1000003) ^ this.f46626c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46624a + ", osData=" + this.f46625b + ", deviceData=" + this.f46626c + "}";
    }
}
