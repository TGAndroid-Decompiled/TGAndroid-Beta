package u2;
public final class t0 {
    public final int f43770a;
    public final boolean f43771b;

    public t0(int i10, boolean z10) {
        this.f43770a = i10;
        this.f43771b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f43770a == t0Var.f43770a && this.f43771b == t0Var.f43771b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f43770a * 31) + (this.f43771b ? 1 : 0);
    }
}
