package u2;
public final class v0 {
    public final int f50036a;
    public final boolean f50037b;

    public v0(int i10, boolean z10) {
        this.f50036a = i10;
        this.f50037b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v0.class == obj.getClass()) {
                v0 v0Var = (v0) obj;
                if (this.f50036a == v0Var.f50036a && this.f50037b == v0Var.f50037b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f50036a * 31) + (this.f50037b ? 1 : 0);
    }
}
