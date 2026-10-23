package z9;
public final class t0 extends t1 {
    public final String f51947a;
    public final int f51948b;
    public final int f51949c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f51947a = str;
        this.f51948b = i10;
        this.f51949c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f51947a.equals(t0Var.f51947a) && this.f51948b == t0Var.f51948b && this.f51949c == t0Var.f51949c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51947a.hashCode() ^ 1000003) * 1000003) ^ this.f51948b) * 1000003) ^ this.f51949c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f51947a + ", pid=" + this.f51948b + ", importance=" + this.f51949c + ", defaultProcess=" + this.d + "}";
    }
}
