package y9;
public final class t0 extends t1 {
    public final String f52298a;
    public final int f52299b;
    public final int f52300c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f52298a = str;
        this.f52299b = i10;
        this.f52300c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f52298a.equals(t0Var.f52298a) && this.f52299b == t0Var.f52299b && this.f52300c == t0Var.f52300c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52298a.hashCode() ^ 1000003) * 1000003) ^ this.f52299b) * 1000003) ^ this.f52300c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f52298a + ", pid=" + this.f52299b + ", importance=" + this.f52300c + ", defaultProcess=" + this.d + "}";
    }
}
