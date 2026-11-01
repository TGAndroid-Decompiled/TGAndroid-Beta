package z9;
public final class t0 extends t1 {
    public final String f55412a;
    public final int f55413b;
    public final int f55414c;
    public final boolean d;

    public t0(int i10, int i11, String str, boolean z10) {
        this.f55412a = str;
        this.f55413b = i10;
        this.f55414c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f55412a.equals(t0Var.f55412a) && this.f55413b == t0Var.f55413b && this.f55414c == t0Var.f55414c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f55412a.hashCode() ^ 1000003) * 1000003) ^ this.f55413b) * 1000003) ^ this.f55414c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f55412a + ", pid=" + this.f55413b + ", importance=" + this.f55414c + ", defaultProcess=" + this.d + "}";
    }
}
