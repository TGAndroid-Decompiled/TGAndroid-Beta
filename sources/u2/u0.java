package u2;
public final class u0 {
    public final int f47398a;
    public final boolean f47399b;

    public u0(int i10, boolean z10) {
        this.f47398a = i10;
        this.f47399b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u0.class == obj.getClass()) {
                u0 u0Var = (u0) obj;
                if (this.f47398a == u0Var.f47398a && this.f47399b == u0Var.f47399b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47398a * 31) + (this.f47399b ? 1 : 0);
    }
}
