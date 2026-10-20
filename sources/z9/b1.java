package z9;
public final class b1 {
    public final c1 f51325a;
    public final e1 f51326b;
    public final d1 f51327c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f51325a = c1Var;
        this.f51326b = e1Var;
        this.f51327c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f51325a.equals(b1Var.f51325a) && this.f51326b.equals(b1Var.f51326b) && this.f51327c.equals(b1Var.f51327c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51325a.hashCode() ^ 1000003) * 1000003) ^ this.f51326b.hashCode()) * 1000003) ^ this.f51327c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f51325a + ", osData=" + this.f51326b + ", deviceData=" + this.f51327c + "}";
    }
}
