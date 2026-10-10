package y9;
public final class t0 extends t1 {
    public final String f52110a;
    public final int f52111b;
    public final int f52112c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f52110a = str;
        this.f52111b = i10;
        this.f52112c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f52110a.equals(t0Var.f52110a) && this.f52111b == t0Var.f52111b && this.f52112c == t0Var.f52112c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52110a.hashCode() ^ 1000003) * 1000003) ^ this.f52111b) * 1000003) ^ this.f52112c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f52110a + ", pid=" + this.f52111b + ", importance=" + this.f52112c + ", defaultProcess=" + this.d + "}";
    }
}
