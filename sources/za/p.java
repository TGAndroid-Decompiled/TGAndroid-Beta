package za;
public final class p {
    public final String f53141a;
    public final int f53142b;
    public final int f53143c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f53141a = str;
        this.f53142b = i10;
        this.f53143c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f53141a, pVar.f53141a) && this.f53142b == pVar.f53142b && this.f53143c == pVar.f53143c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f53141a.hashCode() * 31) + this.f53142b) * 31) + this.f53143c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f53141a + ", pid=" + this.f53142b + ", importance=" + this.f53143c + ", isDefaultProcess=" + this.d + ')';
    }
}
