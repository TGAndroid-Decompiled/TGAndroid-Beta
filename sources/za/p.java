package za;
public final class p {
    public final String f48844a;
    public final int f48845b;
    public final int f48846c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f48844a = str;
        this.f48845b = i10;
        this.f48846c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f48844a, pVar.f48844a) && this.f48845b == pVar.f48845b && this.f48846c == pVar.f48846c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f48844a.hashCode() * 31) + this.f48845b) * 31) + this.f48846c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f48844a + ", pid=" + this.f48845b + ", importance=" + this.f48846c + ", isDefaultProcess=" + this.d + ')';
    }
}
