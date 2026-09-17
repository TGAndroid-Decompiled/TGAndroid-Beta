package y9;
public final class t0 extends t1 {
    public final String f49918a;
    public final int f49919b;
    public final int f49920c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f49918a = str;
        this.f49919b = i10;
        this.f49920c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f49918a.equals(t0Var.f49918a) && this.f49919b == t0Var.f49919b && this.f49920c == t0Var.f49920c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f49918a.hashCode() ^ 1000003) * 1000003) ^ this.f49919b) * 1000003) ^ this.f49920c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f49918a + ", pid=" + this.f49919b + ", importance=" + this.f49920c + ", defaultProcess=" + this.d + "}";
    }
}
