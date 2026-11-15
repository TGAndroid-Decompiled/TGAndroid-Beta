package x2;
public final class u0 {
    public final int f59673a;
    public final boolean f59674b;

    public u0(int i7, boolean z10) {
        this.f59673a = i7;
        this.f59674b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u0.class == obj.getClass()) {
                u0 u0Var = (u0) obj;
                if (this.f59673a == u0Var.f59673a && this.f59674b == u0Var.f59674b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f59673a * 31) + (this.f59674b ? 1 : 0);
    }
}
