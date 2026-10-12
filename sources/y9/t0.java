package y9;
public final class t0 extends t1 {
    public final String f52290a;
    public final int f52291b;
    public final int f52292c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f52290a = str;
        this.f52291b = i10;
        this.f52292c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f52290a.equals(t0Var.f52290a) && this.f52291b == t0Var.f52291b && this.f52292c == t0Var.f52292c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52290a.hashCode() ^ 1000003) * 1000003) ^ this.f52291b) * 1000003) ^ this.f52292c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f52290a + ", pid=" + this.f52291b + ", importance=" + this.f52292c + ", defaultProcess=" + this.d + "}";
    }
}
