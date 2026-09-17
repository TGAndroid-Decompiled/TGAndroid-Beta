package y9;
public final class b1 {
    public final c1 f46497a;
    public final e1 f46498b;
    public final d1 f46499c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46497a = c1Var;
        this.f46498b = e1Var;
        this.f46499c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46497a.equals(b1Var.f46497a) && this.f46498b.equals(b1Var.f46498b) && this.f46499c.equals(b1Var.f46499c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46497a.hashCode() ^ 1000003) * 1000003) ^ this.f46498b.hashCode()) * 1000003) ^ this.f46499c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46497a + ", osData=" + this.f46498b + ", deviceData=" + this.f46499c + "}";
    }
}
