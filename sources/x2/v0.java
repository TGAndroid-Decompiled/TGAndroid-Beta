package x2;
public final class v0 {
    public final int f58485a;
    public final boolean f58486b;

    public v0(int i7, boolean z9) {
        this.f58485a = i7;
        this.f58486b = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f58485a == v0Var.f58485a && this.f58486b == v0Var.f58486b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f58485a * 31) + (this.f58486b ? 1 : 0);
    }
}
