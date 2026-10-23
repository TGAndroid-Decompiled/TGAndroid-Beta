package u2;
public final class x0 {
    public final int f47919a;
    public final boolean f47920b;

    public x0(int i10, boolean z10) {
        this.f47919a = i10;
        this.f47920b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && x0.class == obj.getClass()) {
                x0 x0Var = (x0) obj;
                if (this.f47919a == x0Var.f47919a && this.f47920b == x0Var.f47920b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47919a * 31) + (this.f47920b ? 1 : 0);
    }
}
