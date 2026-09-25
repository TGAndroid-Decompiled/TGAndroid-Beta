package y9;
public final class b1 {
    public final c1 f46754a;
    public final e1 f46755b;
    public final d1 f46756c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46754a = c1Var;
        this.f46755b = e1Var;
        this.f46756c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46754a.equals(b1Var.f46754a) && this.f46755b.equals(b1Var.f46755b) && this.f46756c.equals(b1Var.f46756c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46754a.hashCode() ^ 1000003) * 1000003) ^ this.f46755b.hashCode()) * 1000003) ^ this.f46756c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46754a + ", osData=" + this.f46755b + ", deviceData=" + this.f46756c + "}";
    }
}
