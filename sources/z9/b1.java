package z9;
public final class b1 {
    public final c1 f49934a;
    public final e1 f49935b;
    public final d1 f49936c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f49934a = c1Var;
        this.f49935b = e1Var;
        this.f49936c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f49934a.equals(b1Var.f49934a) && this.f49935b.equals(b1Var.f49935b) && this.f49936c.equals(b1Var.f49936c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49934a.hashCode() ^ 1000003) * 1000003) ^ this.f49935b.hashCode()) * 1000003) ^ this.f49936c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f49934a + ", osData=" + this.f49935b + ", deviceData=" + this.f49936c + "}";
    }
}
