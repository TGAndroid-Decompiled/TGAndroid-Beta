package za;
public final class p {
    public final String f49137a;
    public final int f49138b;
    public final int f49139c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f49137a = str;
        this.f49138b = i10;
        this.f49139c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f49137a, pVar.f49137a) && this.f49138b == pVar.f49138b && this.f49139c == pVar.f49139c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f49137a.hashCode() * 31) + this.f49138b) * 31) + this.f49139c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f49137a + ", pid=" + this.f49138b + ", importance=" + this.f49139c + ", isDefaultProcess=" + this.d + ')';
    }
}
