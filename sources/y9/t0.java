package y9;
public final class t0 extends t1 {
    public final String f46909a;
    public final int f46910b;
    public final int f46911c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f46909a = str;
        this.f46910b = i10;
        this.f46911c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f46909a.equals(t0Var.f46909a) && this.f46910b == t0Var.f46910b && this.f46911c == t0Var.f46911c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46909a.hashCode() ^ 1000003) * 1000003) ^ this.f46910b) * 1000003) ^ this.f46911c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f46909a + ", pid=" + this.f46910b + ", importance=" + this.f46911c + ", defaultProcess=" + this.d + "}";
    }
}
