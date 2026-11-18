package x2;
public final class v0 {
    public final int f60246a;
    public final boolean f60247b;

    public v0(int i7, boolean z10) {
        this.f60246a = i7;
        this.f60247b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f60246a == v0Var.f60246a && this.f60247b == v0Var.f60247b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f60246a * 31) + (this.f60247b ? 1 : 0);
    }
}
