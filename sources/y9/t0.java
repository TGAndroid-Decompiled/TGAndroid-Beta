package y9;
public final class t0 extends t1 {
    public final String f46899a;
    public final int f46900b;
    public final int f46901c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f46899a = str;
        this.f46900b = i10;
        this.f46901c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f46899a.equals(t0Var.f46899a) && this.f46900b == t0Var.f46900b && this.f46901c == t0Var.f46901c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46899a.hashCode() ^ 1000003) * 1000003) ^ this.f46900b) * 1000003) ^ this.f46901c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f46899a + ", pid=" + this.f46900b + ", importance=" + this.f46901c + ", defaultProcess=" + this.d + "}";
    }
}
