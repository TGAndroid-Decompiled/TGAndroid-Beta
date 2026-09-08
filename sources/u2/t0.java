package u2;
public final class t0 {
    public final int f46834a;
    public final boolean f46835b;

    public t0(int i10, boolean z10) {
        this.f46834a = i10;
        this.f46835b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f46834a == t0Var.f46834a && this.f46835b == t0Var.f46835b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f46834a * 31) + (this.f46835b ? 1 : 0);
    }
}
