package x2;
public final class v0 {
    public final int f58494a;
    public final boolean f58495b;

    public v0(int i7, boolean z9) {
        this.f58494a = i7;
        this.f58495b = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f58494a == v0Var.f58494a && this.f58495b == v0Var.f58495b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f58494a * 31) + (this.f58495b ? 1 : 0);
    }
}
