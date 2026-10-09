package u2;
public final class t0 {
    public final int f48710a;
    public final boolean f48711b;

    public t0(int i10, boolean z10) {
        this.f48710a = i10;
        this.f48711b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f48710a == t0Var.f48710a && this.f48711b == t0Var.f48711b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f48710a * 31) + (this.f48711b ? 1 : 0);
    }
}
