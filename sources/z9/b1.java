package z9;
public final class b1 {
    public final c1 f55255a;
    public final e1 f55256b;
    public final d1 f55257c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f55255a = c1Var;
        this.f55256b = e1Var;
        this.f55257c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f55255a.equals(b1Var.f55255a) && this.f55256b.equals(b1Var.f55256b) && this.f55257c.equals(b1Var.f55257c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f55255a.hashCode() ^ 1000003) * 1000003) ^ this.f55256b.hashCode()) * 1000003) ^ this.f55257c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f55255a + ", osData=" + this.f55256b + ", deviceData=" + this.f55257c + "}";
    }
}
