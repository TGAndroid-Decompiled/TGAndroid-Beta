package y9;
public final class b1 {
    public final c1 f51930a;
    public final e1 f51931b;
    public final d1 f51932c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f51930a = c1Var;
        this.f51931b = e1Var;
        this.f51932c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f51930a.equals(b1Var.f51930a) && this.f51931b.equals(b1Var.f51931b) && this.f51932c.equals(b1Var.f51932c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51930a.hashCode() ^ 1000003) * 1000003) ^ this.f51931b.hashCode()) * 1000003) ^ this.f51932c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f51930a + ", osData=" + this.f51931b + ", deviceData=" + this.f51932c + "}";
    }
}
