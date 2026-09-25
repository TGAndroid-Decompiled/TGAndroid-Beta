package y9;
public final class t0 extends t1 {
    public final String f46911a;
    public final int f46912b;
    public final int f46913c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f46911a = str;
        this.f46912b = i10;
        this.f46913c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f46911a.equals(t0Var.f46911a) && this.f46912b == t0Var.f46912b && this.f46913c == t0Var.f46913c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46911a.hashCode() ^ 1000003) * 1000003) ^ this.f46912b) * 1000003) ^ this.f46913c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f46911a + ", pid=" + this.f46912b + ", importance=" + this.f46913c + ", defaultProcess=" + this.d + "}";
    }
}
