package z9;
public final class t0 extends t1 {
    public final String f51477a;
    public final int f51478b;
    public final int f51479c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f51477a = str;
        this.f51478b = i10;
        this.f51479c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f51477a.equals(t0Var.f51477a) && this.f51478b == t0Var.f51478b && this.f51479c == t0Var.f51479c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51477a.hashCode() ^ 1000003) * 1000003) ^ this.f51478b) * 1000003) ^ this.f51479c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f51477a + ", pid=" + this.f51478b + ", importance=" + this.f51479c + ", defaultProcess=" + this.d + "}";
    }
}
