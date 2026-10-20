package u2;
public final class w0 {
    public final int f47461a;
    public final boolean f47462b;

    public w0(int i10, boolean z10) {
        this.f47461a = i10;
        this.f47462b = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w0.class == obj.getClass()) {
                w0 w0Var = (w0) obj;
                if (this.f47461a == w0Var.f47461a && this.f47462b == w0Var.f47462b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f47461a * 31) + (this.f47462b ? 1 : 0);
    }
}
