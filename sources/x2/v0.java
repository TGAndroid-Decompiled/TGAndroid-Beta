package x2;
public final class v0 {
    public final int f58389a;
    public final boolean f58390b;

    public v0(int i7, boolean z9) {
        this.f58389a = i7;
        this.f58390b = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f58389a == v0Var.f58389a && this.f58390b == v0Var.f58390b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f58389a * 31) + (this.f58390b ? 1 : 0);
    }
}
