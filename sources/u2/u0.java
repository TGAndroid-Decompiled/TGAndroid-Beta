package u2;
public final class u0 {
    public final int f47406a;
    public final boolean f47407b;

    public u0(int i10, boolean z10) {
        this.f47406a = i10;
        this.f47407b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u0.class == obj.getClass()) {
                u0 u0Var = (u0) obj;
                if (this.f47406a == u0Var.f47406a && this.f47407b == u0Var.f47407b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47406a * 31) + (this.f47407b ? 1 : 0);
    }
}
