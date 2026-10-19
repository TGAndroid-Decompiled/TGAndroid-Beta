package z9;
public final class b1 {
    public final c1 f51320a;
    public final e1 f51321b;
    public final d1 f51322c;

    public b1(c1 c1Var, e1 e1Var, d1 d1Var) {
        this.f51320a = c1Var;
        this.f51321b = e1Var;
        this.f51322c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            if (this.f51320a.equals(b1Var.f51320a) && this.f51321b.equals(b1Var.f51321b) && this.f51322c.equals(b1Var.f51322c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51320a.hashCode() ^ 1000003) * 1000003) ^ this.f51321b.hashCode()) * 1000003) ^ this.f51322c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f51320a + ", osData=" + this.f51321b + ", deviceData=" + this.f51322c + "}";
    }
}
