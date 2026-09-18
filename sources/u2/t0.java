package u2;
public final class t0 {
    public final int f43741a;
    public final boolean f43742b;

    public t0(int i10, boolean z10) {
        this.f43741a = i10;
        this.f43742b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f43741a == t0Var.f43741a && this.f43742b == t0Var.f43742b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43741a * 31) + (this.f43742b ? 1 : 0);
    }
}
