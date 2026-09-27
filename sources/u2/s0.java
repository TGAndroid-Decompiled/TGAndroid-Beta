package u2;
public final class s0 {
    public final int f43811a;
    public final boolean f43812b;

    public s0(int i10, boolean z10) {
        this.f43811a = i10;
        this.f43812b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s0.class == obj.getClass()) {
                s0 s0Var = (s0) obj;
                if (this.f43811a == s0Var.f43811a && this.f43812b == s0Var.f43812b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43811a * 31) + (this.f43812b ? 1 : 0);
    }
}
