package za;
public final class p {
    public final String f51469a;
    public final int f51470b;
    public final int f51471c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f51469a = str;
        this.f51470b = i10;
        this.f51471c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f51469a, pVar.f51469a) && this.f51470b == pVar.f51470b && this.f51471c == pVar.f51471c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f51469a.hashCode() * 31) + this.f51470b) * 31) + this.f51471c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f51469a + ", pid=" + this.f51470b + ", importance=" + this.f51471c + ", isDefaultProcess=" + this.d + ')';
    }
}
