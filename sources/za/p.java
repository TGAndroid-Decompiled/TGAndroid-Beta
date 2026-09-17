package za;
public final class p {
    public final String f51501a;
    public final int f51502b;
    public final int f51503c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f51501a = str;
        this.f51502b = i10;
        this.f51503c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f51501a, pVar.f51501a) && this.f51502b == pVar.f51502b && this.f51503c == pVar.f51503c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f51501a.hashCode() * 31) + this.f51502b) * 31) + this.f51503c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f51501a + ", pid=" + this.f51502b + ", importance=" + this.f51503c + ", isDefaultProcess=" + this.d + ')';
    }
}
