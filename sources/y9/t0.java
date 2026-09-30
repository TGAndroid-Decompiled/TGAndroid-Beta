package y9;
public final class t0 extends t1 {
    public final String f47018a;
    public final int f47019b;
    public final int f47020c;
    public final boolean d;

    public t0(String str, int i10, int i11, boolean z10) {
        this.f47018a = str;
        this.f47019b = i10;
        this.f47020c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            t0 t0Var = (t0) ((t1) obj);
            if (this.f47018a.equals(t0Var.f47018a) && this.f47019b == t0Var.f47019b && this.f47020c == t0Var.f47020c && this.d == t0Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.f47018a.hashCode() ^ 1000003) * 1000003) ^ this.f47019b) * 1000003) ^ this.f47020c) * 1000003;
        if (this.d) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f47018a + ", pid=" + this.f47019b + ", importance=" + this.f47020c + ", defaultProcess=" + this.d + "}";
    }
}
