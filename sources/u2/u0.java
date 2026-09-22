package u2;
public final class u0 {
    public final int f43810a;
    public final boolean f43811b;

    public u0(int i10, boolean z10) {
        this.f43810a = i10;
        this.f43811b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u0.class == obj.getClass()) {
                u0 u0Var = (u0) obj;
                if (this.f43810a == u0Var.f43810a && this.f43811b == u0Var.f43811b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43810a * 31) + (this.f43811b ? 1 : 0);
    }
}
