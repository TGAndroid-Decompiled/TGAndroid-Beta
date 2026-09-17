package y9;
public final class t0 extends t1 {
    public final String f49889a;
    public final int f49890b;
    public final int f49891c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f49889a = str;
        this.f49890b = i10;
        this.f49891c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f49889a.equals(t0Var.f49889a) && this.f49890b == t0Var.f49890b && this.f49891c == t0Var.f49891c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f49889a.hashCode() ^ 1000003) * 1000003) ^ this.f49890b) * 1000003) ^ this.f49891c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f49889a + ", pid=" + this.f49890b + ", importance=" + this.f49891c + ", defaultProcess=" + this.d + "}";
    }
}
