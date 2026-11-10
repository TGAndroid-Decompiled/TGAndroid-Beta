package x2;
public final class u0 {
    public final int f58491a;
    public final boolean f58492b;

    public u0(int i7, boolean z9) {
        this.f58491a = i7;
        this.f58492b = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u0.class == obj.getClass()) {
                u0 u0Var = (u0) obj;
                if (this.f58491a == u0Var.f58491a && this.f58492b == u0Var.f58492b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f58491a * 31) + (this.f58492b ? 1 : 0);
    }
}
