package y9;
public final class b1 {
    public final c1 f52110a;
    public final e1 f52111b;
    public final d1 f52112c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f52110a = c1Var;
        this.f52111b = e1Var;
        this.f52112c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f52110a.equals(b1Var.f52110a) && this.f52111b.equals(b1Var.f52111b) && this.f52112c.equals(b1Var.f52112c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f52110a.hashCode() ^ 1000003) * 1000003) ^ this.f52111b.hashCode()) * 1000003) ^ this.f52112c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f52110a + ", osData=" + this.f52111b + ", deviceData=" + this.f52112c + "}";
    }
}
