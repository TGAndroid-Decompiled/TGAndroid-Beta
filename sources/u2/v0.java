package u2;
public final class v0 {
    public final int f49440a;
    public final boolean f49441b;

    public v0(int i10, boolean z10) {
        this.f49440a = i10;
        this.f49441b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f49440a == v0Var.f49440a && this.f49441b == v0Var.f49441b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f49440a * 31) + (this.f49441b ? 1 : 0);
    }
}
