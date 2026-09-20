package u2;
public final class u0 {
    public final int f43789a;
    public final boolean f43790b;

    public u0(int i10, boolean z10) {
        this.f43789a = i10;
        this.f43790b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u0.class == obj.getClass()) {
                u0 u0Var = (u0) obj;
                if (this.f43789a == u0Var.f43789a && this.f43790b == u0Var.f43790b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43789a * 31) + (this.f43790b ? 1 : 0);
    }
}
