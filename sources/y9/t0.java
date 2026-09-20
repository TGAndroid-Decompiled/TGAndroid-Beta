package y9;
public final class t0 extends t1 {
    public final String f46933a;
    public final int f46934b;
    public final int f46935c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f46933a = str;
        this.f46934b = i10;
        this.f46935c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f46933a.equals(t0Var.f46933a) && this.f46934b == t0Var.f46934b && this.f46935c == t0Var.f46935c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46933a.hashCode() ^ 1000003) * 1000003) ^ this.f46934b) * 1000003) ^ this.f46935c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f46933a + ", pid=" + this.f46934b + ", importance=" + this.f46935c + ", defaultProcess=" + this.d + "}";
    }
}
