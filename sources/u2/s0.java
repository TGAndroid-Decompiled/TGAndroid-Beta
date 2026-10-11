package u2;
public final class s0 {
    public final int f48806a;
    public final boolean f48807b;

    public s0(int i10, boolean z10) {
        this.f48806a = i10;
        this.f48807b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s0.class == obj.getClass()) {
                s0 s0Var = (s0) obj;
                if (this.f48806a == s0Var.f48806a && this.f48807b == s0Var.f48807b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f48806a * 31) + (this.f48807b ? 1 : 0);
    }
}
