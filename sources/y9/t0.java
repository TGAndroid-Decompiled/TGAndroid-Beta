package y9;
public final class t0 extends t1 {
    public final String f50785a;
    public final int f50786b;
    public final int f50787c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f50785a = str;
        this.f50786b = i10;
        this.f50787c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f50785a.equals(t0Var.f50785a) && this.f50786b == t0Var.f50786b && this.f50787c == t0Var.f50787c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f50785a.hashCode() ^ 1000003) * 1000003) ^ this.f50786b) * 1000003) ^ this.f50787c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f50785a + ", pid=" + this.f50786b + ", importance=" + this.f50787c + ", defaultProcess=" + this.d + "}";
    }
}
