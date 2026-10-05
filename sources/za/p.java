package za;
public final class p {
    public final String f53168a;
    public final int f53169b;
    public final int f53170c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f53168a = str;
        this.f53169b = i10;
        this.f53170c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f53168a, pVar.f53168a) && this.f53169b == pVar.f53169b && this.f53170c == pVar.f53170c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f53168a.hashCode() * 31) + this.f53169b) * 31) + this.f53170c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f53168a + ", pid=" + this.f53169b + ", importance=" + this.f53170c + ", isDefaultProcess=" + this.d + ')';
    }
}
