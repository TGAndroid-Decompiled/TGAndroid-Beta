package u2;
public final class t0 {
    public final int f43771a;
    public final boolean f43772b;

    public t0(int i10, boolean z10) {
        this.f43771a = i10;
        this.f43772b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f43771a == t0Var.f43771a && this.f43772b == t0Var.f43772b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43771a * 31) + (this.f43772b ? 1 : 0);
    }
}
