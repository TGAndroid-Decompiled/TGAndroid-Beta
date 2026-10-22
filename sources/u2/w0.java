package u2;
public final class w0 {
    public final int f47464a;
    public final boolean f47465b;

    public w0(int i10, boolean z10) {
        this.f47464a = i10;
        this.f47465b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w0.class == obj.getClass()) {
                w0 w0Var = (w0) obj;
                if (this.f47464a == w0Var.f47464a && this.f47465b == w0Var.f47465b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47464a * 31) + (this.f47465b ? 1 : 0);
    }
}
