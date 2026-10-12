package u2;
public final class v0 {
    public final int f46061a;
    public final boolean f46062b;

    public v0(int i10, boolean z10) {
        this.f46061a = i10;
        this.f46062b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f46061a == v0Var.f46061a && this.f46062b == v0Var.f46062b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f46061a * 31) + (this.f46062b ? 1 : 0);
    }
}
