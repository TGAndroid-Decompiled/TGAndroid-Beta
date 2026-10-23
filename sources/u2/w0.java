package u2;
public final class w0 {
    public final int f47465a;
    public final boolean f47466b;

    public w0(int i10, boolean z10) {
        this.f47465a = i10;
        this.f47466b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w0.class == obj.getClass()) {
                w0 w0Var = (w0) obj;
                if (this.f47465a == w0Var.f47465a && this.f47466b == w0Var.f47466b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47465a * 31) + (this.f47466b ? 1 : 0);
    }
}
