package z9;
public final class t0 extends t1 {
    public final String f51485a;
    public final int f51486b;
    public final int f51487c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f51485a = str;
        this.f51486b = i10;
        this.f51487c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f51485a.equals(t0Var.f51485a) && this.f51486b == t0Var.f51486b && this.f51487c == t0Var.f51487c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51485a.hashCode() ^ 1000003) * 1000003) ^ this.f51486b) * 1000003) ^ this.f51487c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f51485a + ", pid=" + this.f51486b + ", importance=" + this.f51487c + ", defaultProcess=" + this.d + "}";
    }
}
