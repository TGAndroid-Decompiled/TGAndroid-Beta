package y9;
public final class b1 {
    public final c1 f46502a;
    public final e1 f46503b;
    public final d1 f46504c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46502a = c1Var;
        this.f46503b = e1Var;
        this.f46504c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46502a.equals(b1Var.f46502a) && this.f46503b.equals(b1Var.f46503b) && this.f46504c.equals(b1Var.f46504c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46502a.hashCode() ^ 1000003) * 1000003) ^ this.f46503b.hashCode()) * 1000003) ^ this.f46504c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46502a + ", osData=" + this.f46503b + ", deviceData=" + this.f46504c + "}";
    }
}
