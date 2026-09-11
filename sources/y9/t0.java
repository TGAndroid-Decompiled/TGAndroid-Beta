package y9;
public final class t0 extends t1 {
    public final String f49888a;
    public final int f49889b;
    public final int f49890c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f49888a = str;
        this.f49889b = i10;
        this.f49890c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f49888a.equals(t0Var.f49888a) && this.f49889b == t0Var.f49889b && this.f49890c == t0Var.f49890c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f49888a.hashCode() ^ 1000003) * 1000003) ^ this.f49889b) * 1000003) ^ this.f49890c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f49888a + ", pid=" + this.f49889b + ", importance=" + this.f49890c + ", defaultProcess=" + this.d + "}";
    }
}
