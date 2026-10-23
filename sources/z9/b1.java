package z9;
public final class b1 {
    public final c1 f51790a;
    public final e1 f51791b;
    public final d1 f51792c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f51790a = c1Var;
        this.f51791b = e1Var;
        this.f51792c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f51790a.equals(b1Var.f51790a) && this.f51791b.equals(b1Var.f51791b) && this.f51792c.equals(b1Var.f51792c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51790a.hashCode() ^ 1000003) * 1000003) ^ this.f51791b.hashCode()) * 1000003) ^ this.f51792c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f51790a + ", osData=" + this.f51791b + ", deviceData=" + this.f51792c + "}";
    }
}
