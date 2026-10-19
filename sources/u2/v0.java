package u2;
public final class v0 {
    public final int f47445a;
    public final boolean f47446b;

    public v0(int i10, boolean z10) {
        this.f47445a = i10;
        this.f47446b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f47445a == v0Var.f47445a && this.f47446b == v0Var.f47446b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47445a * 31) + (this.f47446b ? 1 : 0);
    }
}
