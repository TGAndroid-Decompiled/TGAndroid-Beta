package za;
public final class p {
    public final String f48849a;
    public final int f48850b;
    public final int f48851c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f48849a = str;
        this.f48850b = i10;
        this.f48851c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (kotlin.jvm.internal.i.a(this.f48849a, pVar.f48849a) && this.f48850b == pVar.f48850b && this.f48851c == pVar.f48851c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f48849a.hashCode() * 31) + this.f48850b) * 31) + this.f48851c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f48849a + ", pid=" + this.f48850b + ", importance=" + this.f48851c + ", isDefaultProcess=" + this.d + ')';
    }
}
