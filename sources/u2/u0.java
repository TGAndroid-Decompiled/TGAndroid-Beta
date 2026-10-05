package u2;
public final class u0 {
    public final int f47413a;
    public final boolean f47414b;

    public u0(int i10, boolean z10) {
        this.f47413a = i10;
        this.f47414b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u0.class == obj.getClass()) {
                u0 u0Var = (u0) obj;
                if (this.f47413a == u0Var.f47413a && this.f47414b == u0Var.f47414b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47413a * 31) + (this.f47414b ? 1 : 0);
    }
}
