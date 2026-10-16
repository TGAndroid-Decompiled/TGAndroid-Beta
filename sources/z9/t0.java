package z9;
public final class t0 extends t1 {
    public final String f50092a;
    public final int f50093b;
    public final int f50094c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f50092a = str;
        this.f50093b = i10;
        this.f50094c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f50092a.equals(t0Var.f50092a) && this.f50093b == t0Var.f50093b && this.f50094c == t0Var.f50094c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f50092a.hashCode() ^ 1000003) * 1000003) ^ this.f50093b) * 1000003) ^ this.f50094c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f50092a + ", pid=" + this.f50093b + ", importance=" + this.f50094c + ", defaultProcess=" + this.d + "}";
    }
}
