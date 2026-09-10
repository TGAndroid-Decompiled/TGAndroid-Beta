package u2;
public final class v0 {
    public final int f42460a;
    public final boolean f42461b;

    public v0(int i10, boolean z10) {
        this.f42460a = i10;
        this.f42461b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f42460a == v0Var.f42460a && this.f42461b == v0Var.f42461b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f42460a * 31) + (this.f42461b ? 1 : 0);
    }
}
