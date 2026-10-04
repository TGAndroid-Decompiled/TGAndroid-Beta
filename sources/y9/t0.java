package y9;
public final class t0 extends t1 {
    public final String f50769a;
    public final int f50770b;
    public final int f50771c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f50769a = str;
        this.f50770b = i10;
        this.f50771c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f50769a.equals(t0Var.f50769a) && this.f50770b == t0Var.f50770b && this.f50771c == t0Var.f50771c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f50769a.hashCode() ^ 1000003) * 1000003) ^ this.f50770b) * 1000003) ^ this.f50771c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f50769a + ", pid=" + this.f50770b + ", importance=" + this.f50771c + ", defaultProcess=" + this.d + "}";
    }
}
