package u2;
public final class t0 {
    public final int f46835a;
    public final boolean f46836b;

    public t0(int i10, boolean z10) {
        this.f46835a = i10;
        this.f46836b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f46835a == t0Var.f46835a && this.f46836b == t0Var.f46836b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f46835a * 31) + (this.f46836b ? 1 : 0);
    }
}
