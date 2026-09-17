package za;
public final class p {
    public final String f51470a;
    public final int f51471b;
    public final int f51472c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f51470a = str;
        this.f51471b = i10;
        this.f51472c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f51470a, pVar.f51470a) && this.f51471b == pVar.f51471b && this.f51472c == pVar.f51472c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f51470a.hashCode() * 31) + this.f51471b) * 31) + this.f51472c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f51470a + ", pid=" + this.f51471b + ", importance=" + this.f51472c + ", isDefaultProcess=" + this.d + ')';
    }
}
