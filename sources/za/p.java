package za;
public final class p {
    public final String f48814a;
    public final int f48815b;
    public final int f48816c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f48814a = str;
        this.f48815b = i10;
        this.f48816c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f48814a, pVar.f48814a) && this.f48815b == pVar.f48815b && this.f48816c == pVar.f48816c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f48814a.hashCode() * 31) + this.f48815b) * 31) + this.f48816c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f48814a + ", pid=" + this.f48815b + ", importance=" + this.f48816c + ", isDefaultProcess=" + this.d + ')';
    }
}
