package z9;
public final class b1 {
    public final c1 f51340a;
    public final e1 f51341b;
    public final d1 f51342c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f51340a = c1Var;
        this.f51341b = e1Var;
        this.f51342c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f51340a.equals(b1Var.f51340a) && this.f51341b.equals(b1Var.f51341b) && this.f51342c.equals(b1Var.f51342c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51340a.hashCode() ^ 1000003) * 1000003) ^ this.f51341b.hashCode()) * 1000003) ^ this.f51342c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f51340a + ", osData=" + this.f51341b + ", deviceData=" + this.f51342c + "}";
    }
}
