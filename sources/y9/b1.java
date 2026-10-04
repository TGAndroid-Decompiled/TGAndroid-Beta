package y9;
public final class b1 {
    public final c1 f50598a;
    public final e1 f50599b;
    public final d1 f50600c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f50598a = c1Var;
        this.f50599b = e1Var;
        this.f50600c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f50598a.equals(b1Var.f50598a) && this.f50599b.equals(b1Var.f50599b) && this.f50600c.equals(b1Var.f50600c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50598a.hashCode() ^ 1000003) * 1000003) ^ this.f50599b.hashCode()) * 1000003) ^ this.f50600c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f50598a + ", osData=" + this.f50599b + ", deviceData=" + this.f50600c + "}";
    }
}
