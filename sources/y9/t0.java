package y9;
public final class t0 extends t1 {
    public final String f46912a;
    public final int f46913b;
    public final int f46914c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f46912a = str;
        this.f46913b = i10;
        this.f46914c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f46912a.equals(t0Var.f46912a) && this.f46913b == t0Var.f46913b && this.f46914c == t0Var.f46914c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46912a.hashCode() ^ 1000003) * 1000003) ^ this.f46913b) * 1000003) ^ this.f46914c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f46912a + ", pid=" + this.f46913b + ", importance=" + this.f46914c + ", defaultProcess=" + this.d + "}";
    }
}
