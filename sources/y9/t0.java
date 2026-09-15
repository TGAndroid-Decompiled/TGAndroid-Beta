package y9;
public final class t0 extends t1 {
    public final String f46631a;
    public final int f46632b;
    public final int f46633c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f46631a = str;
        this.f46632b = i10;
        this.f46633c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f46631a.equals(t0Var.f46631a) && this.f46632b == t0Var.f46632b && this.f46633c == t0Var.f46633c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46631a.hashCode() ^ 1000003) * 1000003) ^ this.f46632b) * 1000003) ^ this.f46633c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f46631a + ", pid=" + this.f46632b + ", importance=" + this.f46633c + ", defaultProcess=" + this.d + "}";
    }
}
