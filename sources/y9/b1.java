package y9;
public final class b1 {
    public final c1 f46474a;
    public final e1 f46475b;
    public final d1 f46476c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46474a = c1Var;
        this.f46475b = e1Var;
        this.f46476c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46474a.equals(b1Var.f46474a) && this.f46475b.equals(b1Var.f46475b) && this.f46476c.equals(b1Var.f46476c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46474a.hashCode() ^ 1000003) * 1000003) ^ this.f46475b.hashCode()) * 1000003) ^ this.f46476c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46474a + ", osData=" + this.f46475b + ", deviceData=" + this.f46476c + "}";
    }
}
