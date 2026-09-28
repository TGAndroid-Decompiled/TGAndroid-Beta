package za;
public final class r {
    public final String f49102a;
    public final int f49103b;
    public final int f49104c;
    public final boolean d;

    public r(String str, int i10, int i11, boolean z10) {
        this.f49102a = str;
        this.f49103b = i10;
        this.f49104c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (kotlin.jvm.internal.i.a(this.f49102a, rVar.f49102a) && this.f49103b == rVar.f49103b && this.f49104c == rVar.f49104c && this.d == rVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f49102a.hashCode() * 31) + this.f49103b) * 31) + this.f49104c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f49102a + ", pid=" + this.f49103b + ", importance=" + this.f49104c + ", isDefaultProcess=" + this.d + ')';
    }
}
