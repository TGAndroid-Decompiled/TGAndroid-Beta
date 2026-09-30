package u2;
public final class t0 {
    public final int f43879a;
    public final boolean f43880b;

    public t0(int i10, boolean z10) {
        this.f43879a = i10;
        this.f43880b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f43879a == t0Var.f43879a && this.f43880b == t0Var.f43880b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43879a * 31) + (this.f43880b ? 1 : 0);
    }
}
