package y9;
public final class t0 extends t1 {
    public final String f46585a;
    public final int f46586b;
    public final int f46587c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f46585a = str;
        this.f46586b = i10;
        this.f46587c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f46585a.equals(t0Var.f46585a) && this.f46586b == t0Var.f46586b && this.f46587c == t0Var.f46587c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46585a.hashCode() ^ 1000003) * 1000003) ^ this.f46586b) * 1000003) ^ this.f46587c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f46585a + ", pid=" + this.f46586b + ", importance=" + this.f46587c + ", defaultProcess=" + this.d + "}";
    }
}
