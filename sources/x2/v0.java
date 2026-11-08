package x2;
public final class v0 {
    public final int f58484a;
    public final boolean f58485b;

    public v0(int i7, boolean z9) {
        this.f58484a = i7;
        this.f58485b = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f58484a == v0Var.f58484a && this.f58485b == v0Var.f58485b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f58484a * 31) + (this.f58485b ? 1 : 0);
    }
}
