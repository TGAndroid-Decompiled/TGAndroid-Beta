package z9;
public final class t0 extends t1 {
    public final String f51497a;
    public final int f51498b;
    public final int f51499c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f51497a = str;
        this.f51498b = i10;
        this.f51499c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f51497a.equals(t0Var.f51497a) && this.f51498b == t0Var.f51498b && this.f51499c == t0Var.f51499c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f51497a.hashCode() ^ 1000003) * 1000003) ^ this.f51498b) * 1000003) ^ this.f51499c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f51497a + ", pid=" + this.f51498b + ", importance=" + this.f51499c + ", defaultProcess=" + this.d + "}";
    }
}
