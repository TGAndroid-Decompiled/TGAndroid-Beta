package u2;
public final class t0 {
    public final int f43486a;
    public final boolean f43487b;

    public t0(int i10, boolean z10) {
        this.f43486a = i10;
        this.f43487b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f43486a == t0Var.f43486a && this.f43487b == t0Var.f43487b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43486a * 31) + (this.f43487b ? 1 : 0);
    }
}
