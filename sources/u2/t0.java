package u2;
public final class t0 {
    public final int f43514a;
    public final boolean f43515b;

    public t0(int i10, boolean z10) {
        this.f43514a = i10;
        this.f43515b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f43514a == t0Var.f43514a && this.f43515b == t0Var.f43515b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43514a * 31) + (this.f43515b ? 1 : 0);
    }
}
