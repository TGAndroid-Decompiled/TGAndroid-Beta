package y9;
public final class t0 extends t1 {
    public final String f52153a;
    public final int f52154b;
    public final int f52155c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f52153a = str;
        this.f52154b = i10;
        this.f52155c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f52153a.equals(t0Var.f52153a) && this.f52154b == t0Var.f52154b && this.f52155c == t0Var.f52155c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52153a.hashCode() ^ 1000003) * 1000003) ^ this.f52154b) * 1000003) ^ this.f52155c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f52153a + ", pid=" + this.f52154b + ", importance=" + this.f52155c + ", defaultProcess=" + this.d + "}";
    }
}
