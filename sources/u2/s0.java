package u2;
public final class s0 {
    public final int f48921a;
    public final boolean f48922b;

    public s0(int i10, boolean z10) {
        this.f48921a = i10;
        this.f48922b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s0.class == obj.getClass()) {
                s0 s0Var = (s0) obj;
                if (this.f48921a == s0Var.f48921a && this.f48922b == s0Var.f48922b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f48921a * 31) + (this.f48922b ? 1 : 0);
    }
}
