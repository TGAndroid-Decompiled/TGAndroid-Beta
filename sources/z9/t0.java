package z9;
public final class t0 extends t1 {
    public final String f55394a;
    public final int f55395b;
    public final int f55396c;
    public final boolean d;

    public t0(int i10, int i11, String str, boolean z10) {
        this.f55394a = str;
        this.f55395b = i10;
        this.f55396c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f55394a.equals(t0Var.f55394a) && this.f55395b == t0Var.f55395b && this.f55396c == t0Var.f55396c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f55394a.hashCode() ^ 1000003) * 1000003) ^ this.f55395b) * 1000003) ^ this.f55396c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f55394a + ", pid=" + this.f55395b + ", importance=" + this.f55396c + ", defaultProcess=" + this.d + "}";
    }
}
