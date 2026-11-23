package x2;
public final class v0 {
    public final int f60374a;
    public final boolean f60375b;

    public v0(int i7, boolean z10) {
        this.f60374a = i7;
        this.f60375b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f60374a == v0Var.f60374a && this.f60375b == v0Var.f60375b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f60374a * 31) + (this.f60375b ? 1 : 0);
    }
}
