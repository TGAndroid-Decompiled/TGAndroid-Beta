package y9;
public final class t0 extends t1 {
    public final String f52187a;
    public final int f52188b;
    public final int f52189c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f52187a = str;
        this.f52188b = i10;
        this.f52189c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f52187a.equals(t0Var.f52187a) && this.f52188b == t0Var.f52188b && this.f52189c == t0Var.f52189c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52187a.hashCode() ^ 1000003) * 1000003) ^ this.f52188b) * 1000003) ^ this.f52189c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f52187a + ", pid=" + this.f52188b + ", importance=" + this.f52189c + ", defaultProcess=" + this.d + "}";
    }
}
