package y9;
public final class t0 extends t1 {
    public final String f46659a;
    public final int f46660b;
    public final int f46661c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f46659a = str;
        this.f46660b = i10;
        this.f46661c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f46659a.equals(t0Var.f46659a) && this.f46660b == t0Var.f46660b && this.f46661c == t0Var.f46661c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46659a.hashCode() ^ 1000003) * 1000003) ^ this.f46660b) * 1000003) ^ this.f46661c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f46659a + ", pid=" + this.f46660b + ", importance=" + this.f46661c + ", defaultProcess=" + this.d + "}";
    }
}
