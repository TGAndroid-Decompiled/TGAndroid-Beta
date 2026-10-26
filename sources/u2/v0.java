package u2;
public final class v0 {
    public final int f49443a;
    public final boolean f49444b;

    public v0(int i10, boolean z10) {
        this.f49443a = i10;
        this.f49444b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f49443a == v0Var.f49443a && this.f49444b == v0Var.f49444b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f49443a * 31) + (this.f49444b ? 1 : 0);
    }
}
