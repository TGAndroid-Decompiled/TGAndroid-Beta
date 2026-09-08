package za;
public final class p {
    public final String f51500a;
    public final int f51501b;
    public final int f51502c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f51500a = str;
        this.f51501b = i10;
        this.f51502c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f51500a, pVar.f51500a) && this.f51501b == pVar.f51501b && this.f51502c == pVar.f51502c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f51500a.hashCode() * 31) + this.f51501b) * 31) + this.f51502c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f51500a + ", pid=" + this.f51501b + ", importance=" + this.f51502c + ", isDefaultProcess=" + this.d + ')';
    }
}
