package u2;
public final class u0 {
    public final int f47488a;
    public final boolean f47489b;

    public u0(int i10, boolean z10) {
        this.f47488a = i10;
        this.f47489b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u0.class == obj.getClass()) {
                u0 u0Var = (u0) obj;
                if (this.f47488a == u0Var.f47488a && this.f47489b == u0Var.f47489b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47488a * 31) + (this.f47489b ? 1 : 0);
    }
}
