package u2;
public final class t0 {
    public final int f43482a;
    public final boolean f43483b;

    public t0(int i10, boolean z10) {
        this.f43482a = i10;
        this.f43483b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f43482a == t0Var.f43482a && this.f43483b == t0Var.f43483b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43482a * 31) + (this.f43483b ? 1 : 0);
    }
}
