package u2;
public final class t0 {
    public final int f43772a;
    public final boolean f43773b;

    public t0(int i10, boolean z10) {
        this.f43772a = i10;
        this.f43773b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f43772a == t0Var.f43772a && this.f43773b == t0Var.f43773b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43772a * 31) + (this.f43773b ? 1 : 0);
    }
}
