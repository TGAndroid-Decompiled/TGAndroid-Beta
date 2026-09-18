package za;
public final class p {
    public final String f49075a;
    public final int f49076b;
    public final int f49077c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f49075a = str;
        this.f49076b = i10;
        this.f49077c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f49075a, pVar.f49075a) && this.f49076b == pVar.f49076b && this.f49077c == pVar.f49077c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f49075a.hashCode() * 31) + this.f49076b) * 31) + this.f49077c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f49075a + ", pid=" + this.f49076b + ", importance=" + this.f49077c + ", isDefaultProcess=" + this.d + ')';
    }
}
