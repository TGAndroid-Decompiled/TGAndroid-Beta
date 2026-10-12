package z9;
public final class t0 extends t1 {
    public final String f50091a;
    public final int f50092b;
    public final int f50093c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f50091a = str;
        this.f50092b = i10;
        this.f50093c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f50091a.equals(t0Var.f50091a) && this.f50092b == t0Var.f50092b && this.f50093c == t0Var.f50093c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f50091a.hashCode() ^ 1000003) * 1000003) ^ this.f50092b) * 1000003) ^ this.f50093c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f50091a + ", pid=" + this.f50092b + ", importance=" + this.f50093c + ", defaultProcess=" + this.d + "}";
    }
}
