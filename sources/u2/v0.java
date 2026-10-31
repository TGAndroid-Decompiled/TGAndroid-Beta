package u2;
public final class v0 {
    public final int f50022a;
    public final boolean f50023b;

    public v0(int i10, boolean z10) {
        this.f50022a = i10;
        this.f50023b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f50022a == v0Var.f50022a && this.f50023b == v0Var.f50023b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f50022a * 31) + (this.f50023b ? 1 : 0);
    }
}
