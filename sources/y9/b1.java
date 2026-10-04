package y9;
public final class b1 {
    public final c1 f50590a;
    public final e1 f50591b;
    public final d1 f50592c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f50590a = c1Var;
        this.f50591b = e1Var;
        this.f50592c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f50590a.equals(b1Var.f50590a) && this.f50591b.equals(b1Var.f50591b) && this.f50592c.equals(b1Var.f50592c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50590a.hashCode() ^ 1000003) * 1000003) ^ this.f50591b.hashCode()) * 1000003) ^ this.f50592c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f50590a + ", osData=" + this.f50591b + ", deviceData=" + this.f50592c + "}";
    }
}
