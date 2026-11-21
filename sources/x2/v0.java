package x2;
public final class v0 {
    public final int f60287a;
    public final boolean f60288b;

    public v0(int i7, boolean z10) {
        this.f60287a = i7;
        this.f60288b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f60287a == v0Var.f60287a && this.f60288b == v0Var.f60288b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f60287a * 31) + (this.f60288b ? 1 : 0);
    }
}
