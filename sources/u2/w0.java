package u2;
public final class w0 {
    public final int f47452a;
    public final boolean f47453b;

    public w0(int i10, boolean z10) {
        this.f47452a = i10;
        this.f47453b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w0.class == obj.getClass()) {
                w0 w0Var = (w0) obj;
                if (this.f47452a == w0Var.f47452a && this.f47453b == w0Var.f47453b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47452a * 31) + (this.f47453b ? 1 : 0);
    }
}
