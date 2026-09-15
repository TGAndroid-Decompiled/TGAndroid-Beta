package za;
public final class p {
    public final String f48821a;
    public final int f48822b;
    public final int f48823c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f48821a = str;
        this.f48822b = i10;
        this.f48823c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f48821a, pVar.f48821a) && this.f48822b == pVar.f48822b && this.f48823c == pVar.f48823c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f48821a.hashCode() * 31) + this.f48822b) * 31) + this.f48823c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f48821a + ", pid=" + this.f48822b + ", importance=" + this.f48823c + ", isDefaultProcess=" + this.d + ')';
    }
}
