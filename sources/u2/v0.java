package u2;
public final class v0 {
    public final int f47468a;
    public final boolean f47469b;

    public v0(int i10, boolean z10) {
        this.f47468a = i10;
        this.f47469b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f47468a == v0Var.f47468a && this.f47469b == v0Var.f47469b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47468a * 31) + (this.f47469b ? 1 : 0);
    }
}
