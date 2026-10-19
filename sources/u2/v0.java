package u2;
public final class v0 {
    public final int f47447a;
    public final boolean f47448b;

    public v0(int i10, boolean z10) {
        this.f47447a = i10;
        this.f47448b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f47447a == v0Var.f47447a && this.f47448b == v0Var.f47448b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47447a * 31) + (this.f47448b ? 1 : 0);
    }
}
