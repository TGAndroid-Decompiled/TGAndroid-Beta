package u2;
public final class s0 {
    public final int f48913a;
    public final boolean f48914b;

    public s0(int i10, boolean z10) {
        this.f48913a = i10;
        this.f48914b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s0.class == obj.getClass()) {
                s0 s0Var = (s0) obj;
                if (this.f48913a == s0Var.f48913a && this.f48914b == s0Var.f48914b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f48913a * 31) + (this.f48914b ? 1 : 0);
    }
}
