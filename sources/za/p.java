package za;
public final class p {
    public final String f53147a;
    public final int f53148b;
    public final int f53149c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f53147a = str;
        this.f53148b = i10;
        this.f53149c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f53147a, pVar.f53147a) && this.f53148b == pVar.f53148b && this.f53149c == pVar.f53149c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f53147a.hashCode() * 31) + this.f53148b) * 31) + this.f53149c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f53147a + ", pid=" + this.f53148b + ", importance=" + this.f53149c + ", isDefaultProcess=" + this.d + ')';
    }
}
