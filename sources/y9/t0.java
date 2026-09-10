package y9;
public final class t0 extends t1 {
    public final String f46781a;
    public final int f46782b;
    public final int f46783c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f46781a = str;
        this.f46782b = i10;
        this.f46783c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f46781a.equals(t0Var.f46781a) && this.f46782b == t0Var.f46782b && this.f46783c == t0Var.f46783c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46781a.hashCode() ^ 1000003) * 1000003) ^ this.f46782b) * 1000003) ^ this.f46783c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f46781a + ", pid=" + this.f46782b + ", importance=" + this.f46783c + ", defaultProcess=" + this.d + "}";
    }
}
