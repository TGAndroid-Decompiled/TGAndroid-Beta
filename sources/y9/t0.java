package y9;
public final class t0 extends t1 {
    public final String f50770a;
    public final int f50771b;
    public final int f50772c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f50770a = str;
        this.f50771b = i10;
        this.f50772c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f50770a.equals(t0Var.f50770a) && this.f50771b == t0Var.f50771b && this.f50772c == t0Var.f50772c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f50770a.hashCode() ^ 1000003) * 1000003) ^ this.f50771b) * 1000003) ^ this.f50772c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f50770a + ", pid=" + this.f50771b + ", importance=" + this.f50772c + ", defaultProcess=" + this.d + "}";
    }
}
