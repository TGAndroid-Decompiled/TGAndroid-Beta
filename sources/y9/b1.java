package y9;
public final class b1 {
    public final c1 f46470a;
    public final e1 f46471b;
    public final d1 f46472c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46470a = c1Var;
        this.f46471b = e1Var;
        this.f46472c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46470a.equals(b1Var.f46470a) && this.f46471b.equals(b1Var.f46471b) && this.f46472c.equals(b1Var.f46472c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46470a.hashCode() ^ 1000003) * 1000003) ^ this.f46471b.hashCode()) * 1000003) ^ this.f46472c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46470a + ", osData=" + this.f46471b + ", deviceData=" + this.f46472c + "}";
    }
}
