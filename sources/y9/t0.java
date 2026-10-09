package y9;
public final class t0 extends t1 {
    public final String f52066a;
    public final int f52067b;
    public final int f52068c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f52066a = str;
        this.f52067b = i10;
        this.f52068c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f52066a.equals(t0Var.f52066a) && this.f52067b == t0Var.f52067b && this.f52068c == t0Var.f52068c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52066a.hashCode() ^ 1000003) * 1000003) ^ this.f52067b) * 1000003) ^ this.f52068c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f52066a + ", pid=" + this.f52067b + ", importance=" + this.f52068c + ", defaultProcess=" + this.d + "}";
    }
}
