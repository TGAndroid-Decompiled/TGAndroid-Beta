package y9;
public final class t0 extends t1 {
    public final String f46654a;
    public final int f46655b;
    public final int f46656c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f46654a = str;
        this.f46655b = i10;
        this.f46656c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f46654a.equals(t0Var.f46654a) && this.f46655b == t0Var.f46655b && this.f46656c == t0Var.f46656c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46654a.hashCode() ^ 1000003) * 1000003) ^ this.f46655b) * 1000003) ^ this.f46656c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f46654a + ", pid=" + this.f46655b + ", importance=" + this.f46656c + ", defaultProcess=" + this.d + "}";
    }
}
