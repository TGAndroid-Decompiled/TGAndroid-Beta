package z9;
public final class t0 extends t1 {
    public final String f51522a;
    public final int f51523b;
    public final int f51524c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f51522a = str;
        this.f51523b = i10;
        this.f51524c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f51522a.equals(t0Var.f51522a) && this.f51523b == t0Var.f51523b && this.f51524c == t0Var.f51524c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51522a.hashCode() ^ 1000003) * 1000003) ^ this.f51523b) * 1000003) ^ this.f51524c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f51522a + ", pid=" + this.f51523b + ", importance=" + this.f51524c + ", defaultProcess=" + this.d + "}";
    }
}
