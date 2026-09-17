package u2;
public final class t0 {
    public final int f46807a;
    public final boolean f46808b;

    public t0(int i10, boolean z10) {
        this.f46807a = i10;
        this.f46808b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f46807a == t0Var.f46807a && this.f46808b == t0Var.f46808b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f46807a * 31) + (this.f46808b ? 1 : 0);
    }
}
