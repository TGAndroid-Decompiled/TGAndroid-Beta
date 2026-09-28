package za;
public final class r {
    public final String f49101a;
    public final int f49102b;
    public final int f49103c;
    public final boolean d;

    public r(String str, int i10, int i11, boolean z10) {
        this.f49101a = str;
        this.f49102b = i10;
        this.f49103c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f49101a, rVar.f49101a) && this.f49102b == rVar.f49102b && this.f49103c == rVar.f49103c && this.d == rVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f49101a.hashCode() * 31) + this.f49102b) * 31) + this.f49103c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f49101a + ", pid=" + this.f49102b + ", importance=" + this.f49103c + ", isDefaultProcess=" + this.d + ')';
    }
}
