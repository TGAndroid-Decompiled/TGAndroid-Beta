package y9;
public final class t0 extends t1 {
    public final String f46886a;
    public final int f46887b;
    public final int f46888c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f46886a = str;
        this.f46887b = i10;
        this.f46888c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f46886a.equals(t0Var.f46886a) && this.f46887b == t0Var.f46887b && this.f46888c == t0Var.f46888c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46886a.hashCode() ^ 1000003) * 1000003) ^ this.f46887b) * 1000003) ^ this.f46888c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f46886a + ", pid=" + this.f46887b + ", importance=" + this.f46888c + ", defaultProcess=" + this.d + "}";
    }
}
