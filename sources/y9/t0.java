package y9;
public final class t0 extends t1 {
    public final String f46627a;
    public final int f46628b;
    public final int f46629c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f46627a = str;
        this.f46628b = i10;
        this.f46629c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f46627a.equals(t0Var.f46627a) && this.f46628b == t0Var.f46628b && this.f46629c == t0Var.f46629c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f46627a.hashCode() ^ 1000003) * 1000003) ^ this.f46628b) * 1000003) ^ this.f46629c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f46627a + ", pid=" + this.f46628b + ", importance=" + this.f46629c + ", defaultProcess=" + this.d + "}";
    }
}
