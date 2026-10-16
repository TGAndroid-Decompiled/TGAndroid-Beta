package z9;
public final class b1 {
    public final c1 f49935a;
    public final e1 f49936b;
    public final d1 f49937c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f49935a = c1Var;
        this.f49936b = e1Var;
        this.f49937c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f49935a.equals(b1Var.f49935a) && this.f49936b.equals(b1Var.f49936b) && this.f49937c.equals(b1Var.f49937c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49935a.hashCode() ^ 1000003) * 1000003) ^ this.f49936b.hashCode()) * 1000003) ^ this.f49937c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f49935a + ", osData=" + this.f49936b + ", deviceData=" + this.f49937c + "}";
    }
}
