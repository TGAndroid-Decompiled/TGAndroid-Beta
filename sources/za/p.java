package za;
public final class p {
    public final String f53142a;
    public final int f53143b;
    public final int f53144c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f53142a = str;
        this.f53143b = i10;
        this.f53144c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f53142a, pVar.f53142a) && this.f53143b == pVar.f53143b && this.f53144c == pVar.f53144c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f53142a.hashCode() * 31) + this.f53143b) * 31) + this.f53144c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f53142a + ", pid=" + this.f53143b + ", importance=" + this.f53144c + ", isDefaultProcess=" + this.d + ')';
    }
}
