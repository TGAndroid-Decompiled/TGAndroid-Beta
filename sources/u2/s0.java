package u2;
public final class s0 {
    public final int f43410a;
    public final boolean f43411b;

    public s0(int i10, boolean z10) {
        this.f43410a = i10;
        this.f43411b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s0.class == obj.getClass()) {
                s0 s0Var = (s0) obj;
                if (this.f43410a == s0Var.f43410a && this.f43411b == s0Var.f43411b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43410a * 31) + (this.f43411b ? 1 : 0);
    }
}
