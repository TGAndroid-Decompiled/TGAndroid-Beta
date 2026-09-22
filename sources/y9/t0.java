package y9;
public final class t0 extends t1 {
    public final String f46954a;
    public final int f46955b;
    public final int f46956c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f46954a = str;
        this.f46955b = i10;
        this.f46956c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f46954a.equals(t0Var.f46954a) && this.f46955b == t0Var.f46955b && this.f46956c == t0Var.f46956c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46954a.hashCode() ^ 1000003) * 1000003) ^ this.f46955b) * 1000003) ^ this.f46956c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f46954a + ", pid=" + this.f46955b + ", importance=" + this.f46956c + ", defaultProcess=" + this.d + "}";
    }
}
