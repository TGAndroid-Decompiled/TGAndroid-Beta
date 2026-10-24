package u2;
public final class x0 {
    public final int f47918a;
    public final boolean f47919b;

    public x0(int i10, boolean z10) {
        this.f47918a = i10;
        this.f47919b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && x0.class == obj.getClass()) {
                x0 x0Var = (x0) obj;
                if (this.f47918a == x0Var.f47918a && this.f47919b == x0Var.f47919b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47918a * 31) + (this.f47919b ? 1 : 0);
    }
}
