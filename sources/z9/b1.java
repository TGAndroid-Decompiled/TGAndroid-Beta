package z9;
public final class b1 {
    public final c1 f51789a;
    public final e1 f51790b;
    public final d1 f51791c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f51789a = c1Var;
        this.f51790b = e1Var;
        this.f51791c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f51789a.equals(b1Var.f51789a) && this.f51790b.equals(b1Var.f51790b) && this.f51791c.equals(b1Var.f51791c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51789a.hashCode() ^ 1000003) * 1000003) ^ this.f51790b.hashCode()) * 1000003) ^ this.f51791c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f51789a + ", osData=" + this.f51790b + ", deviceData=" + this.f51791c + "}";
    }
}
