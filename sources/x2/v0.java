package x2;
public final class v0 {
    public final int f58390a;
    public final boolean f58391b;

    public v0(int i7, boolean z9) {
        this.f58390a = i7;
        this.f58391b = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f58390a == v0Var.f58390a && this.f58391b == v0Var.f58391b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f58390a * 31) + (this.f58391b ? 1 : 0);
    }
}
