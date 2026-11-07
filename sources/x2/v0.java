package x2;
public final class v0 {
    public final int f58395a;
    public final boolean f58396b;

    public v0(int i7, boolean z9) {
        this.f58395a = i7;
        this.f58396b = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f58395a == v0Var.f58395a && this.f58396b == v0Var.f58396b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f58395a * 31) + (this.f58396b ? 1 : 0);
    }
}
