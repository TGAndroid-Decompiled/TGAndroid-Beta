package u2;
public final class s0 {
    public final int f48772a;
    public final boolean f48773b;

    public s0(int i10, boolean z10) {
        this.f48772a = i10;
        this.f48773b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s0.class == obj.getClass()) {
                s0 s0Var = (s0) obj;
                if (this.f48772a == s0Var.f48772a && this.f48773b == s0Var.f48773b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f48772a * 31) + (this.f48773b ? 1 : 0);
    }
}
