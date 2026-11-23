package x2;
public final class v0 {
    public final int f60291a;
    public final boolean f60292b;

    public v0(int i7, boolean z10) {
        this.f60291a = i7;
        this.f60292b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f60291a == v0Var.f60291a && this.f60292b == v0Var.f60292b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f60291a * 31) + (this.f60292b ? 1 : 0);
    }
}
