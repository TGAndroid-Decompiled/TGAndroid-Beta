package za;
public final class p {
    public final String f49141a;
    public final int f49142b;
    public final int f49143c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f49141a = str;
        this.f49142b = i10;
        this.f49143c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f49141a, pVar.f49141a) && this.f49142b == pVar.f49142b && this.f49143c == pVar.f49143c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f49141a.hashCode() * 31) + this.f49142b) * 31) + this.f49143c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f49141a + ", pid=" + this.f49142b + ", importance=" + this.f49143c + ", isDefaultProcess=" + this.d + ')';
    }
}
