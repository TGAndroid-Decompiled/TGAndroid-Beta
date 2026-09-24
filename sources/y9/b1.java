package y9;
public final class b1 {
    public final c1 f46742a;
    public final e1 f46743b;
    public final d1 f46744c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46742a = c1Var;
        this.f46743b = e1Var;
        this.f46744c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46742a.equals(b1Var.f46742a) && this.f46743b.equals(b1Var.f46743b) && this.f46744c.equals(b1Var.f46744c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46742a.hashCode() ^ 1000003) * 1000003) ^ this.f46743b.hashCode()) * 1000003) ^ this.f46744c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46742a + ", osData=" + this.f46743b + ", deviceData=" + this.f46744c + "}";
    }
}
