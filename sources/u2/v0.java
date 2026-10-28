package u2;
public final class v0 {
    public final int f49478a;
    public final boolean f49479b;

    public v0(int i10, boolean z10) {
        this.f49478a = i10;
        this.f49479b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f49478a == v0Var.f49478a && this.f49479b == v0Var.f49479b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f49478a * 31) + (this.f49479b ? 1 : 0);
    }
}
