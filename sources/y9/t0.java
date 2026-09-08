package y9;
public final class t0 extends t1 {
    public final String f49917a;
    public final int f49918b;
    public final int f49919c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f49917a = str;
        this.f49918b = i10;
        this.f49919c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f49917a.equals(t0Var.f49917a) && this.f49918b == t0Var.f49918b && this.f49919c == t0Var.f49919c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f49917a.hashCode() ^ 1000003) * 1000003) ^ this.f49918b) * 1000003) ^ this.f49919c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f49917a + ", pid=" + this.f49918b + ", importance=" + this.f49919c + ", defaultProcess=" + this.d + "}";
    }
}
