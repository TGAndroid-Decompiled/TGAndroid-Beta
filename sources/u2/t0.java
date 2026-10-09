package u2;
public final class t0 {
    public final int f48708a;
    public final boolean f48709b;

    public t0(int i10, boolean z10) {
        this.f48708a = i10;
        this.f48709b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f48708a == t0Var.f48708a && this.f48709b == t0Var.f48709b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f48708a * 31) + (this.f48709b ? 1 : 0);
    }
}
