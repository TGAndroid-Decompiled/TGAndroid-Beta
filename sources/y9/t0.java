package y9;
public final class t0 extends t1 {
    public final String f50778a;
    public final int f50779b;
    public final int f50780c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f50778a = str;
        this.f50779b = i10;
        this.f50780c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f50778a.equals(t0Var.f50778a) && this.f50779b == t0Var.f50779b && this.f50780c == t0Var.f50780c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f50778a.hashCode() ^ 1000003) * 1000003) ^ this.f50779b) * 1000003) ^ this.f50780c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f50778a + ", pid=" + this.f50779b + ", importance=" + this.f50780c + ", defaultProcess=" + this.d + "}";
    }
}
