package x2;
public final class v0 {
    public final int f60256a;
    public final boolean f60257b;

    public v0(int i7, boolean z10) {
        this.f60256a = i7;
        this.f60257b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f60256a == v0Var.f60256a && this.f60257b == v0Var.f60257b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f60256a * 31) + (this.f60257b ? 1 : 0);
    }
}
