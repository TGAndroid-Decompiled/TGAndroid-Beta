package z9;
public final class b1 {
    public final c1 f55237a;
    public final e1 f55238b;
    public final d1 f55239c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f55237a = c1Var;
        this.f55238b = e1Var;
        this.f55239c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f55237a.equals(b1Var.f55237a) && this.f55238b.equals(b1Var.f55238b) && this.f55239c.equals(b1Var.f55239c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f55237a.hashCode() ^ 1000003) * 1000003) ^ this.f55238b.hashCode()) * 1000003) ^ this.f55239c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f55237a + ", osData=" + this.f55238b + ", deviceData=" + this.f55239c + "}";
    }
}
