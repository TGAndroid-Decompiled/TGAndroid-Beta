package z9;
public final class t0 extends t1 {
    public final String f51482a;
    public final int f51483b;
    public final int f51484c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f51482a = str;
        this.f51483b = i10;
        this.f51484c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f51482a.equals(t0Var.f51482a) && this.f51483b == t0Var.f51483b && this.f51484c == t0Var.f51484c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51482a.hashCode() ^ 1000003) * 1000003) ^ this.f51483b) * 1000003) ^ this.f51484c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f51482a + ", pid=" + this.f51483b + ", importance=" + this.f51484c + ", defaultProcess=" + this.d + "}";
    }
}
