package x2;
public final class v0 {
    public final int f60245a;
    public final boolean f60246b;

    public v0(int i7, boolean z10) {
        this.f60245a = i7;
        this.f60246b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f60245a == v0Var.f60245a && this.f60246b == v0Var.f60246b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f60245a * 31) + (this.f60246b ? 1 : 0);
    }
}
