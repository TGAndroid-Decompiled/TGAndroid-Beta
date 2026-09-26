package y9;
public final class b1 {
    public final c1 f46752a;
    public final e1 f46753b;
    public final d1 f46754c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46752a = c1Var;
        this.f46753b = e1Var;
        this.f46754c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46752a.equals(b1Var.f46752a) && this.f46753b.equals(b1Var.f46753b) && this.f46754c.equals(b1Var.f46754c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46752a.hashCode() ^ 1000003) * 1000003) ^ this.f46753b.hashCode()) * 1000003) ^ this.f46754c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46752a + ", osData=" + this.f46753b + ", deviceData=" + this.f46754c + "}";
    }
}
