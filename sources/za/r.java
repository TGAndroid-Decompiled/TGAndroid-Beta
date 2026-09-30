package za;
public final class r {
    public final String f49103a;
    public final int f49104b;
    public final int f49105c;
    public final boolean d;

    public r(String str, int i10, int i11, boolean z10) {
        this.f49103a = str;
        this.f49104b = i10;
        this.f49105c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f49103a, rVar.f49103a) && this.f49104b == rVar.f49104b && this.f49105c == rVar.f49105c && this.d == rVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f49103a.hashCode() * 31) + this.f49104b) * 31) + this.f49105c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f49103a + ", pid=" + this.f49104b + ", importance=" + this.f49105c + ", isDefaultProcess=" + this.d + ')';
    }
}
