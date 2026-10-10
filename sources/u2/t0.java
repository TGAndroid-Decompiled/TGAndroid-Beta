package u2;
public final class t0 {
    public final int f48754a;
    public final boolean f48755b;

    public t0(int i10, boolean z10) {
        this.f48754a = i10;
        this.f48755b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f48754a == t0Var.f48754a && this.f48755b == t0Var.f48755b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f48754a * 31) + (this.f48755b ? 1 : 0);
    }
}
