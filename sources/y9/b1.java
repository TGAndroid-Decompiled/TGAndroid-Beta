package y9;
public final class b1 {
    public final c1 f46729a;
    public final e1 f46730b;
    public final d1 f46731c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f46729a = c1Var;
        this.f46730b = e1Var;
        this.f46731c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f46729a.equals(b1Var.f46729a) && this.f46730b.equals(b1Var.f46730b) && this.f46731c.equals(b1Var.f46731c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46729a.hashCode() ^ 1000003) * 1000003) ^ this.f46730b.hashCode()) * 1000003) ^ this.f46731c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f46729a + ", osData=" + this.f46730b + ", deviceData=" + this.f46731c + "}";
    }
}
