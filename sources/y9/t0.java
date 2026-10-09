package y9;
public final class t0 extends t1 {
    public final String f52064a;
    public final int f52065b;
    public final int f52066c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f52064a = str;
        this.f52065b = i10;
        this.f52066c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f52064a.equals(t0Var.f52064a) && this.f52065b == t0Var.f52065b && this.f52066c == t0Var.f52066c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f52064a.hashCode() ^ 1000003) * 1000003) ^ this.f52065b) * 1000003) ^ this.f52066c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f52064a + ", pid=" + this.f52065b + ", importance=" + this.f52066c + ", defaultProcess=" + this.d + "}";
    }
}
