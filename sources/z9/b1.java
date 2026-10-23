package z9;
public final class b1 {
    public final c1 f51329a;
    public final e1 f51330b;
    public final d1 f51331c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f51329a = c1Var;
        this.f51330b = e1Var;
        this.f51331c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f51329a.equals(b1Var.f51329a) && this.f51330b.equals(b1Var.f51330b) && this.f51331c.equals(b1Var.f51331c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51329a.hashCode() ^ 1000003) * 1000003) ^ this.f51330b.hashCode()) * 1000003) ^ this.f51331c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f51329a + ", osData=" + this.f51330b + ", deviceData=" + this.f51331c + "}";
    }
}
