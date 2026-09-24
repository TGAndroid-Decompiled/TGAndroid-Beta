package u2;
public final class t0 {
    public final int f43757a;
    public final boolean f43758b;

    public t0(int i10, boolean z10) {
        this.f43757a = i10;
        this.f43758b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f43757a == t0Var.f43757a && this.f43758b == t0Var.f43758b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43757a * 31) + (this.f43758b ? 1 : 0);
    }
}
