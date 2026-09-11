package u2;
public final class t0 {
    public final int f46806a;
    public final boolean f46807b;

    public t0(int i10, boolean z10) {
        this.f46806a = i10;
        this.f46807b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f46806a == t0Var.f46806a && this.f46807b == t0Var.f46807b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f46806a * 31) + (this.f46807b ? 1 : 0);
    }
}
