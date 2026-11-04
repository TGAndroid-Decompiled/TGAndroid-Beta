package w2;
public final class v0 {
    public final int f57239a;
    public final boolean f57240b;

    public v0(int i3, boolean z10) {
        this.f57239a = i3;
        this.f57240b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f57239a == v0Var.f57239a && this.f57240b == v0Var.f57240b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f57239a * 31) + (this.f57240b ? 1 : 0);
    }
}
