package u2;
public final class t0 {
    public final int f43773a;
    public final boolean f43774b;

    public t0(int i10, boolean z10) {
        this.f43773a = i10;
        this.f43774b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f43773a == t0Var.f43773a && this.f43774b == t0Var.f43774b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43773a * 31) + (this.f43774b ? 1 : 0);
    }
}
