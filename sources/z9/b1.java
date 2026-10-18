package z9;
public final class b1 {
    public final c1 f51365a;
    public final e1 f51366b;
    public final d1 f51367c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f51365a = c1Var;
        this.f51366b = e1Var;
        this.f51367c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f51365a.equals(b1Var.f51365a) && this.f51366b.equals(b1Var.f51366b) && this.f51367c.equals(b1Var.f51367c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51365a.hashCode() ^ 1000003) * 1000003) ^ this.f51366b.hashCode()) * 1000003) ^ this.f51367c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f51365a + ", osData=" + this.f51366b + ", deviceData=" + this.f51367c + "}";
    }
}
