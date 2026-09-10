package za;
public final class p {
    public final String f47938a;
    public final int f47939b;
    public final int f47940c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f47938a = str;
        this.f47939b = i10;
        this.f47940c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f47938a, pVar.f47938a) && this.f47939b == pVar.f47939b && this.f47940c == pVar.f47940c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f47938a.hashCode() * 31) + this.f47939b) * 31) + this.f47940c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f47938a + ", pid=" + this.f47939b + ", importance=" + this.f47940c + ", isDefaultProcess=" + this.d + ')';
    }
}
