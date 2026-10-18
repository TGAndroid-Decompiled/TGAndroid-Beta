package z9;
public final class t0 extends t1 {
    public final String f51475a;
    public final int f51476b;
    public final int f51477c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f51475a = str;
        this.f51476b = i10;
        this.f51477c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f51475a.equals(t0Var.f51475a) && this.f51476b == t0Var.f51476b && this.f51477c == t0Var.f51477c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51475a.hashCode() ^ 1000003) * 1000003) ^ this.f51476b) * 1000003) ^ this.f51477c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f51475a + ", pid=" + this.f51476b + ", importance=" + this.f51477c + ", defaultProcess=" + this.d + "}";
    }
}
