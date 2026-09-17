package u2;
public final class t0 {
    public final int f43509a;
    public final boolean f43510b;

    public t0(int i10, boolean z10) {
        this.f43509a = i10;
        this.f43510b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f43509a == t0Var.f43509a && this.f43510b == t0Var.f43510b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43509a * 31) + (this.f43510b ? 1 : 0);
    }
}
